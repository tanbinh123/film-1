package com.william.film.mapper;

import com.william.film.pojo.Theater;
import com.william.film.pojo.TheaterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TheaterMapper {
    long countByExample(TheaterExample example);

    int deleteByExample(TheaterExample example);

    int deleteByPrimaryKey(Integer theaterId);

    int insert(Theater record);

    int insertSelective(Theater record);

    List<Theater> selectByExample(TheaterExample example);

    Theater selectByPrimaryKey(Integer theaterId);

    int updateByExampleSelective(@Param("record") Theater record, @Param("example") TheaterExample example);

    int updateByExample(@Param("record") Theater record, @Param("example") TheaterExample example);

    int updateByPrimaryKeySelective(Theater record);

    int updateByPrimaryKey(Theater record);
}