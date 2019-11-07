package com.william.film.service.Impl;

import com.william.film.mapper.SeatMapper;
import com.william.film.pojo.Seat;
import com.william.film.service.SeatChooserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SeatChooserServiceImpl implements SeatChooserService {

    @Autowired
    SeatMapper seatMapper;
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
}
