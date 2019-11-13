package com.william.film.mapper;

import com.william.film.pojo.SeatArrangement;
import com.william.film.pojo.SeatArrangementExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SeatArrangementMapper {
    /**
     *查找被选的座位
     * @param scheduleId
     * @return
     */
    int[] selectSeatIdBySchedule(Integer scheduleId);

    /**
     * 查询历史订单
     * @param customerId
     * @return
     */
    List<SeatArrangement>getSeatArrangementById(Integer customerId);

    long countByExample(SeatArrangementExample example);

    List<SeatArrangement> selectSeatStateLowerThanTwo(Integer scheduleId);

    int deleteByExample(SeatArrangementExample example);

    int deleteByPrimaryKey(Integer seatArrangementId);

    int insert(SeatArrangement record);

    int insertSelective(SeatArrangement record);

    List<SeatArrangement> selectByExample(SeatArrangementExample example);

    SeatArrangement selectByPrimaryKey(Integer seatArrangementId);

    int updateByExampleSelective(@Param("record") SeatArrangement record, @Param("example") SeatArrangementExample example);

    int updateByExample(@Param("record") SeatArrangement record, @Param("example") SeatArrangementExample example);

    int updateByPrimaryKeySelective(SeatArrangement record);

    int updateByPrimaryKey(SeatArrangement record);
}