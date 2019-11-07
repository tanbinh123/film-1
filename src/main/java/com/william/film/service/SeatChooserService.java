package com.william.film.service;

import com.william.film.pojo.Seat;

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
}
