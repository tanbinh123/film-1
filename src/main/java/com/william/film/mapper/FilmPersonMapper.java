package com.william.film.mapper;

import com.william.film.pojo.FilmPerson;
import com.william.film.pojo.FilmPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilmPersonMapper {
    long countByExample(FilmPersonExample example);

    int deleteByExample(FilmPersonExample example);

    int deleteByPrimaryKey(Integer personId);

    int insert(FilmPerson record);

    int insertSelective(FilmPerson record);

    List<FilmPerson> selectByExample(FilmPersonExample example);

    FilmPerson selectByPrimaryKey(Integer personId);

    int updateByExampleSelective(@Param("record") FilmPerson record, @Param("example") FilmPersonExample example);

    int updateByExample(@Param("record") FilmPerson record, @Param("example") FilmPersonExample example);

    int updateByPrimaryKeySelective(FilmPerson record);

    int updateByPrimaryKey(FilmPerson record);
}