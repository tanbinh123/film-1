package com.william.film.service;

import com.william.film.pojo.SeatArrangement;
import org.springframework.stereotype.Service;

import java.util.List;


public interface HistoryOrderService {
    /**
     * 查询历史订单
     * @param customerId
     * @return
     */
    List<SeatArrangement>getHistoryOrder(Integer customerId);
}
