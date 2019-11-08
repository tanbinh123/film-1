package com.william.film.service;

import com.william.film.pojo.Schedule;
import com.william.film.pojo.ScheduleWithHallName;

public interface ScheduleService {
    /**
     * 通过id返回schedule
     * @param scheduleID
     * @return
     */
    public Schedule getScheduleById(Integer scheduleID);

    /**
     * 通过id返回ScheduleWithHallName
     * @param scheduleId
     * @return
     */
    public ScheduleWithHallName getScheduleWithName(Integer scheduleId);

    /**
     * 所有日期加一
     */
    public void allDaysAddOne();
}
