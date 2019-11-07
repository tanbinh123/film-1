package com.william.film.controller;


import com.william.film.pojo.Movie;
import com.william.film.pojo.Schedule;
import com.william.film.pojo.ScheduleWithHallName;
import com.william.film.service.Theater_ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class TheaterItemController {
    @Autowired
    Theater_ItemService theater_itemService;
    @RequestMapping("/theater_item")
    public String toTheater(Model model,Integer theaterId){
        List<Movie> movies = theater_itemService.getTheaterMovie(1);
        for (Movie m:movies
             ) {
            System.out.println(m.toString());
        }
        model.addAttribute("todayScheduleMovie",movies);
        System.out.println("电影院Id为:"+theaterId);
        return "theater_item";
    }
//    @RequestMapping("/theater_item_getSchedule")
//    @ResponseBody  List<Schedule>getSchedule()throws Exception{
//        List<Schedule>sc = theater_itemService.getAllScheduleAfterNow(new Date());
//        for (Schedule s:sc
//                ) {
//            System.out.println(s.toString());
//
//        }
//        return sc;
//    }
    @RequestMapping("/theater_get_scheduleDate")
    @ResponseBody List<Date>getDates(Integer movieId)throws Exception{
        //厅号写死了;
        for (Date d:theater_itemService.getDatesByHallIDAndMovieID(movieId,1)
             ) {
            System.out.println("日期:"+d.toString());
        }
        return theater_itemService.getDatesByHallIDAndMovieID(movieId,1);
    }

    @RequestMapping("/theater_get_schedule")
    @ResponseBody List<ScheduleWithHallName>getSchedule(Integer movieId, Integer theaterId, String dateTime)throws Exception{

        System.out.println("entered this method");
        for (ScheduleWithHallName sc:theater_itemService.getSchedulesByDateTheaterMovie(movieId,theaterId,dateTime)
             ) {
            System.out.println("排片表如下:"+sc.toString());
        }
        return theater_itemService.getSchedulesByDateTheaterMovie(movieId,theaterId,dateTime);
    }
}
