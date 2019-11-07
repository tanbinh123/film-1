package com.william.film.controller;

import com.william.film.mapper.ScheduleMapper;
import com.william.film.mapper.SeatMapper;
import com.william.film.pojo.Schedule;
import com.william.film.pojo.Seat;
import com.william.film.service.MovieItemService;
import com.william.film.service.ScheduleService;
import com.william.film.service.SeatChooserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SeatChooserController {
    @Autowired
    SeatChooserService seatChooserService;
    @Autowired
    ScheduleService scheduleService;
    @Autowired
    MovieItemService movieItemService;
    @RequestMapping("/AutoInsertSeat")
    public void insert()throws Exception{
//        for (int row=1;row<7;row++){
//            for (int col=1;col<13;col++){
//                Seat s = new Seat();
//                s.setHallId(1);
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
    public String chooseSeat(Integer scheduleId,Model model)throws Exception{
        Schedule schedule = scheduleService.getScheduleById(scheduleId);
        int theaterId =schedule.getTheaterId();
        int hallId = schedule.getHallId();
        model.addAttribute("rowIndex",seatChooserService.getSeatNum(theaterId,hallId));
        model.addAttribute("movie", movieItemService.selectMovieById(schedule.getMovieId()));
//        model.addAttribute("seatList",seatChooserService.getSeatList(theaterId,hallId));
        return "seatChooser";
    }
    @RequestMapping("get_row_seat")
    @ResponseBody List<Seat> getRow(Integer theaterId,Integer hallId,Integer row) throws Exception{
        theaterId = 1;
        hallId = 1;
        return seatChooserService.getColByRow(theaterId,hallId,row);
    }
}
