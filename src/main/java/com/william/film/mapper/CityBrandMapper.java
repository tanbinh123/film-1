package com.william.film.mapper;

import com.william.film.pojo.CityBrandExample;
import com.william.film.pojo.CityBrandKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityBrandMapper {
    long countByExample(CityBrandExample example);

    int deleteByExample(CityBrandExample example);

    int deleteByPrimaryKey(CityBrandKey key);

    int insert(CityBrandKey record);

    int insertSelective(CityBrandKey record);

    List<CityBrandKey> selectByExample(CityBrandExample example);

    int updateByExampleSelective(@Param("record") CityBrandKey record, @Param("example") CityBrandExample example);

    int updateByExample(@Param("record") CityBrandKey record, @Param("example") CityBrandExample example);
}