package com.william.film.service.Impl;

import com.william.film.mapper.ScheduleMapper;
import com.william.film.pojo.Schedule;
import com.william.film.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    ScheduleMapper scheduleMapper;
    @Override
    public Schedule getScheduleById(Integer scheduleID) {
        return scheduleMapper.selectByPrimaryKey(scheduleID);
    }
}
