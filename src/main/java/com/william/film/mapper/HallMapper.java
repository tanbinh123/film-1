package com.william.film.mapper;

import com.william.film.pojo.Hall;
import com.william.film.pojo.HallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HallMapper {
    long countByExample(HallExample example);

    int deleteByExample(HallExample example);

    int deleteByPrimaryKey(Integer hallId);

    int insert(Hall record);

    int insertSelective(Hall record);

    List<Hall> selectByExample(HallExample example);

    Hall selectByPrimaryKey(Integer hallId);

    int updateByExampleSelective(@Param("record") Hall record, @Param("example") HallExample example);

    int updateByExample(@Param("record") Hall record, @Param("example") HallExample example);

    int updateByPrimaryKeySelective(Hall record);

    int updateByPrimaryKey(Hall record);
}