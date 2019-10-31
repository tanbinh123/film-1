package com.william.film.mapper;

import com.william.film.pojo.OrderSeatExample;
import com.william.film.pojo.OrderSeatKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSeatMapper {
    long countByExample(OrderSeatExample example);

    int deleteByExample(OrderSeatExample example);

    int deleteByPrimaryKey(OrderSeatKey key);

    int insert(OrderSeatKey record);

    int insertSelective(OrderSeatKey record);

    List<OrderSeatKey> selectByExample(OrderSeatExample example);

    int updateByExampleSelective(@Param("record") OrderSeatKey record, @Param("example") OrderSeatExample example);

    int updateByExample(@Param("record") OrderSeatKey record, @Param("example") OrderSeatExample example);
}