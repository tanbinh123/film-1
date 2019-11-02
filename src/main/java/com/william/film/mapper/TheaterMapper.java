package com.william.film.mapper;

import com.william.film.pojo.Theater;
import com.william.film.pojo.TheaterExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TheaterMapper {
    /**
     * 通过品牌或者区名来查询电影院
     * 需要通过注解@Param写参数
     * @param area
     * @param brand
     * @return
     */
    List<Theater>selectTheaterByAreaBrand(@Param("area") String area,@Param("brand") String brand);
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