package com.william.film.service;

import com.william.film.pojo.Movie;
import com.william.film.pojo.Schedule;
import com.william.film.pojo.ScheduleWithHallName;

import java.util.Date;
import java.util.List;

public interface Theater_ItemService {
    /**
     * 返回现在之后的安排
     * @param date
     * @return
     */
    public List<Schedule> getAllScheduleAfterNow(Date date);

    /**
     * 获得电影院本日有排片的电影list
     * @return
     */
    public List<Movie>getTheaterMovie(Integer theaterId);

    /**
     * 获取有多少日期种类
     * @param movieId
     * @param theaterId
     * @return
     */
    public List<Date>getDatesByHallIDAndMovieID(Integer movieId,Integer theaterId);

    /**
     * 查某日的排片表
     * 前台需要传入一个类似"2019-11-11"的值后台会将其转换成Date对象
     * @param movieId
     * @param theaterId
     * @param dateTime
     * @return
     */
    public List<ScheduleWithHallName>getSchedulesByDateTheaterMovie(Integer movieId, Integer theaterId, String dateTime)throws Exception;
}
