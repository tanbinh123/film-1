package com.william.film.service.Impl;

import com.william.film.mapper.SeatArrangementMapper;
import com.william.film.pojo.SeatArrangement;
import com.william.film.service.HistoryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HistoryOrderServiceImpl implements HistoryOrderService {
    @Autowired
    SeatArrangementMapper seatArrangementMapper;
    @Override
    public List<SeatArrangement> getHistoryOrder(Integer customerId) {
        return seatArrangementMapper.getSeatArrangementById(customerId);
    }
}
