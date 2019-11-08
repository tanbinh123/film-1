package com.william.film.service.Impl;

import com.william.film.mapper.HallMapper;
import com.william.film.mapper.ScheduleMapper;
import com.william.film.pojo.Schedule;
import com.william.film.pojo.ScheduleWithHallName;
import com.william.film.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    ScheduleMapper scheduleMapper;
    @Autowired
    HallMapper hallMapper;
    @Override
    public Schedule getScheduleById(Integer scheduleID) {
        return scheduleMapper.selectByPrimaryKey(scheduleID);
    }

    @Override
    public ScheduleWithHallName getScheduleWithName(Integer scheduleId) {
        Schedule sc = scheduleMapper.selectByPrimaryKey(scheduleId);
        return new ScheduleWithHallName(sc,hallMapper.selectHallNameById(sc.getHallId()));
    }

    @Override
    public void allDaysAddOne() {
        scheduleMapper.allDaysAddOne();
    }
}
