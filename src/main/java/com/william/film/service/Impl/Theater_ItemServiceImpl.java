package com.william.film.service.Impl;

import com.william.film.mapper.HallMapper;
import com.william.film.mapper.MovieMapper;
import com.william.film.mapper.ScheduleMapper;
import com.william.film.pojo.Movie;
import com.william.film.pojo.Schedule;
import com.william.film.pojo.ScheduleWithHallName;
import com.william.film.service.Theater_ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
@Service
public class Theater_ItemServiceImpl implements Theater_ItemService {

    @Autowired
    ScheduleMapper scheduleMapper;
    @Autowired
    MovieMapper movieMapper;
    @Autowired
    HallMapper hallMapper;
    @Override
    public List<Schedule> getAllScheduleAfterNow(Date date) {
        return  scheduleMapper.showAllScheduleAfterToday(new Date());
    }

    @Override
    public List<Movie> getTheaterMovie(Integer theaterId) {

        Calendar now = Calendar.getInstance();
        now.set(Calendar.HOUR_OF_DAY,0);
        now.set(Calendar.MINUTE,0);
        now.set(Calendar.SECOND,0);
        Date dateStart = now.getTime();
        //检索一周之内有排片的电影id
        now.set(Calendar.DAY_OF_MONTH,now.get(Calendar.DAY_OF_MONTH)+7);
        now.set(Calendar.HOUR_OF_DAY,23);
        now.set(Calendar.MINUTE,59);
        now.set(Calendar.SECOND,59);
        Date dateEnd = now.getTime();
        System.out.println("dateStart"+dateStart+"  dateEnd"+dateEnd);
        //厅写死为1
        Integer[] movieId = scheduleMapper.showTodayMovieId(dateStart,dateEnd,theaterId);
//        System.out.println("aaaaaaaaaaaaaaaaaaaaa"+movieId.toString());
        List<Movie>movies = new ArrayList<>();
        for (Integer id :movieId
             ) {
            movies.add(movieMapper.selectbyId(id));
        }
        return movies;
    }

    @Override
    public List<Date> getDatesByHallIDAndMovieID(Integer movieId, Integer theaterId) {
        return scheduleMapper.showDatesByHall(movieId,theaterId,new Date());
    }

    @Override
    public List<ScheduleWithHallName> getSchedulesByDateTheaterMovie(Integer movieId, Integer theaterId, String dateTime) throws Exception{
//        String s = dateTime+" 00:00:00";
//        System.out.println(s);
        Date dateStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateTime+" 00:00:00");
        Date dateEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateTime+" 23:59:59");
        List<ScheduleWithHallName>list = new ArrayList<>();
        for (Schedule sc:scheduleMapper.showScheduleByDateMovieTheater(dateStart,dateEnd,movieId,theaterId)
             ) {
            list.add(new ScheduleWithHallName(sc,hallMapper.selectHallNameById(sc.getHallId())));
        }

        return list;
    }
}
