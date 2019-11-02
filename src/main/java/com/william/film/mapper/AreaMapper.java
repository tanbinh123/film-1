package com.william.film.mapper;

import com.william.film.pojo.Area;
import com.william.film.pojo.AreaExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AreaMapper {

    List<Area>findAreasByCity(String cityName);
    long countByExample(AreaExample example);

    int deleteByExample(AreaExample example);

    int insert(Area record);

    int insertSelective(Area record);

    List<Area> selectByExample(AreaExample example);

    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);
}