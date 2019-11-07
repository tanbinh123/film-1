package com.william.film.service;

import com.william.film.pojo.Schedule;

public interface ScheduleService {
    /**
     * 通过id返回schedule
     * @param scheduleID
     * @return
     */
    public Schedule getScheduleById(Integer scheduleID);
}
