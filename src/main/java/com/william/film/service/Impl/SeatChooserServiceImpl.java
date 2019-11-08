package com.william.film.service.Impl;

import com.william.film.mapper.SeatArrangementMapper;
import com.william.film.mapper.SeatMapper;
import com.william.film.pojo.Seat;
import com.william.film.pojo.SeatArrangement;
import com.william.film.service.SeatChooserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SeatChooserServiceImpl implements SeatChooserService {

    @Autowired
    SeatMapper seatMapper;
    @Autowired
    SeatArrangementMapper seatArrangementMapper;
    @Override
    public List<Seat> getSeatList(Integer theaterId, Integer hallId) {
        return seatMapper.selectSeatByTheaterAndHall(theaterId,hallId);
    }

    @Override
    public int[] getSeatNum(Integer theaterId, Integer hallId) {
        return seatMapper.getRowNum(theaterId,hallId);
    }

    @Override
    public List<Seat> getColByRow(Integer theaterId, Integer hallId, Integer row) {
        return seatMapper.selectRow(theaterId,hallId,row);
    }

    @Override
    public void insertSeatArrangement(int seatId, int scheduleId, int customerId,int seatState) {
        SeatArrangement s = new SeatArrangement();
        s.setSeatId(seatId);
        s.setScheduleId(scheduleId);
        s.setCustomerId(customerId);
        s.setSeatState(seatState);
        seatArrangementMapper.insertSelective(s);
    }

    @Override
    public List<SeatArrangement> showSelectedSeats(Integer scheduleId) {
        return seatArrangementMapper.selectSeatStateLowerThanTwo(scheduleId);
    }
}
