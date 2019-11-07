package com.william.film.mapper;

import com.william.film.pojo.Seat;
import com.william.film.pojo.SeatExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SeatMapper {
    /**
     * 用于在seatChooser页面上显示座位表
     * @param theaterId
     * @param hallId
     * @return
     */
    List<Seat>selectSeatByTheaterAndHall(@Param("theaterId")Integer theaterId,@Param("hallId")Integer hallId);

    /**
     * 获得行数
     * @param theaterId
     * @param hallId
     * @return
     */
    int[]getRowNum(@Param("theaterId")Integer theaterId,@Param("hallId")Integer hallId);

    /**
     * 返回一行座位
     * @param theaterId
     * @param hallId
     * @param row
     * @return
     */
    List<Seat>selectRow(@Param("theaterId")Integer theaterId,@Param("hallId")Integer hallId,@Param("row")Integer row);
    long countByExample(SeatExample example);

    int deleteByExample(SeatExample example);

    int deleteByPrimaryKey(Integer seatId);

    int insert(Seat record);

    int insertSelective(Seat record);

    List<Seat> selectByExample(SeatExample example);

    Seat selectByPrimaryKey(Integer seatId);

    int updateByExampleSelective(@Param("record") Seat record, @Param("example") SeatExample example);

    int updateByExample(@Param("record") Seat record, @Param("example") SeatExample example);

    int updateByPrimaryKeySelective(Seat record);

    int updateByPrimaryKey(Seat record);
}