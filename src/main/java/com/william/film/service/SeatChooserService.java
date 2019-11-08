package com.william.film.service;

import com.william.film.pojo.Seat;
import com.william.film.pojo.SeatArrangement;

import java.util.List;

public interface SeatChooserService {
    /**
     *获取所有的座位
     * @param theaterId
     * @param hallId
     * @return
     */
    public List<Seat>getSeatList(Integer theaterId,Integer hallId);

    /**
     * 获取座位行数
     * @param theaterId
     * @param hallId
     * @return
     */
    int[]getSeatNum(Integer theaterId,Integer hallId);

    /**
     * 返回一行座位
     * @param theaterId
     * @param hallId
     * @param row
     * @return
     */
    List<Seat>getColByRow(Integer theaterId,Integer hallId,Integer row);

    void insertSeatArrangement(int seatId,int scheduleId,int customerId,int seatState);

    /**
     * 通过 scheduleId找到被选/被锁定座位
     * @param scheduleId
     * @return
     */
    List<SeatArrangement>showSelectedSeats(Integer scheduleId);
}
