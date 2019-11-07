package com.william.film.mapper;

import com.william.film.pojo.Schedule;
import com.william.film.pojo.ScheduleExample;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ScheduleMapper {
    /**
     * 查询此刻之后的安排
     * @param date
     * @return
     */
    List<Schedule>showAllScheduleAfterToday(Date date);

    /**
     * 示今天所有的电影
     * @param dateStart 00:00:00
     * @param dateEnd 24:59:59
     * @return
     */
    Integer[]showTodayMovieId(@Param("dateStart") Date dateStart,@Param("dateEnd") Date dateEnd,@Param("theaterId")Integer theaterId);

    /**
     * 通过本日和hallid以及电影Id查询有多少种日期
     * @param dateToday
     * @param movieId
     * @param theaterId
     * @return
     */
    List<Date>showDatesByHall(@Param("movieId")Integer movieId,@Param("theaterId") Integer theaterId,@Param("dateToday")Date dateToday);

    /**
     *查单日排片表
     * @param dateStart
     * @param dateEnd
     * @param movieId
     * @param theaterId
     * @return
     */
    List<Schedule>showScheduleByDateMovieTheater(@Param("dateStart")Date dateStart,@Param("dateEnd")Date dateEnd,@Param("movieId")Integer movieId,@Param("theaterId")Integer theaterId);
    long countByExample(ScheduleExample example);

    int deleteByExample(ScheduleExample example);

    int deleteByPrimaryKey(Integer scheduleId);

    int insert(Schedule record);

    int insertSelective(Schedule record);

    List<Schedule> selectByExample(ScheduleExample example);

    Schedule selectByPrimaryKey(Integer scheduleId);

    int updateByExampleSelective(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    int updateByExample(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKey(Schedule record);
}