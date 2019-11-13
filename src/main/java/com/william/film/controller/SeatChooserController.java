package com.william.film.controller;


import com.william.film.mapper.SeatMapper;
import com.william.film.pojo.ScheduleWithHallName;
import com.william.film.pojo.Seat;
import com.william.film.pojo.SeatArrangement;
import com.william.film.service.MovieItemService;
import com.william.film.service.ScheduleService;
import com.william.film.service.SeatChooserService;
import com.william.film.service.TheaterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class SeatChooserController {
    @Autowired
    SeatChooserService seatChooserService;
    @Autowired
    ScheduleService scheduleService;
    @Autowired
    MovieItemService movieItemService;
    @Autowired
    TheaterService theaterService;
    @Autowired
    SeatMapper seatMapper;
    @RequestMapping("/AutoInsertSeat")
    public void insert()throws Exception{
//        //很危险,慎用!
//        for (int row=1;row<20;row++){
//            for (int col=1;col<20;col++){
//                Seat s = new Seat();
//                s.setHallId(5);
//                s.setTheaterId(1);
//                s.setSeatCol(col);
//                s.setSeatRow(row);
//                s.setSeatExist(1);
//                s.setSeatLevel(1);
//                s.setSeatState(1);
//                seatMapper.insert(s);
//            }
//        }
//        System.out.println("succeed insert");
    }
    @RequestMapping("/seat_chooser")
    public String chooseSeat(Integer scheduleId,Integer hallId,Model model,HttpServletRequest request)throws Exception{
        ScheduleWithHallName schedule = scheduleService.getScheduleWithName(scheduleId);

        //根据scheddule查schedule

        int theaterId =schedule.getTheaterId();

        String theaterName = theaterService.findTheaterNameById(theaterId);

        SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日 HH:mm");
        String scheduleDate = sdf.format(schedule.getScheduleBeginDateTime());
        System.out.println("scheduleDate"+scheduleDate);
        model.addAttribute("theaterName",theaterName);
        model.addAttribute("scheduleDate",scheduleDate);
        model.addAttribute("schedule",schedule);
        model.addAttribute("rowIndex",seatChooserService.getSeatNum(theaterId,hallId));
        model.addAttribute("movie", movieItemService.selectMovieById(schedule.getMovieId()));
//        model.addAttribute("seatList",seatChooserService.getSeatList(theaterId,hallId));
        //取出用户(如果存在)
//        HttpSession session = request.getSession();
//        model.addAttribute("customerId",session.getAttribute("customerId"));
//        System.out.println("seatChooser中的Session:"+session.getAttribute("customerId"));
//        Cookie[]cookies =request.getCookies();
//        if (null!=cookies){
//            for (Cookie c :cookies) {
//
//            }
//        }
        return "seatChooser";
    }
    @RequestMapping("get_row_seat")
    @ResponseBody List<Seat> getRow(Integer theaterId,Integer hallId,Integer row) throws Exception{
        theaterId = 1;
//        hallId = 1;
        return seatChooserService.getColByRow(theaterId,hallId,row);
    }


    @RequestMapping("order_prepare")
    //@ResponseBody
    //当使用ajax向后台传值或者交互的时候,Controller方法里必须加上@ResponseBody/不然ajax接收不到Controller返回参数会一直报错:java.lang.IllegalArgumentException: Unknown return value type: java.lang.Integer
    //使用synchronized关键字,保证订票线程安全
    @ResponseBody
    synchronized void payPage(Integer[]seatIds, Integer scheduleId, HttpServletRequest request)throws Exception{

        int customerId = 1;
        //从cookies中获取customerId
        Cookie[]cookies = request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies) {
                if(cookie.getName().equals("customerId")) {
                    customerId =Integer.parseInt(cookie.getValue());
                }
            }
        }
        int seatState = 0;
        Date dateTime = new Date();
        for (Integer i:seatIds) {
            System.out.println("seatIds:"+i);
            seatChooserService.insertSeatArrangement(i,scheduleId,customerId,seatState);
        }
        System.out.println("scheduleId"+scheduleId);
        HttpSession  session= request.getSession();
        //锁定座位
        session.setAttribute("seatsId",seatIds);
        //下单时间
        session.setAttribute("lockedTime",dateTime);
    }
    @RequestMapping("/find_selected_seat")
    @ResponseBody List<SeatArrangement> getSelectedSeat(Integer scheduleId){
        List<SeatArrangement> seatArrangements= seatChooserService.showSelectedSeats(scheduleId);
        if(null!=seatArrangements){
            for (SeatArrangement s:seatArrangements
                 ) {
                System.out.println("SeatArrangement:"+s.toString());
            }
            return seatArrangements;
        }else {
            return null;
        }
    }


    /**
     * warning使用此方法会使Schedule表中所有的日期+1
     * @throws Exception
     */
    @RequestMapping("add_date")
    public void add_date()throws  Exception{
        scheduleService.allDaysAddOne();
    }

}
