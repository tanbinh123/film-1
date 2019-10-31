package com.william.film.mapper;

import com.william.film.pojo.FilmPersonImg;
import com.william.film.pojo.FilmPersonImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilmPersonImgMapper {
    long countByExample(FilmPersonImgExample example);

    int deleteByExample(FilmPersonImgExample example);

    int deleteByPrimaryKey(Integer personImg);

    int insert(FilmPersonImg record);

    int insertSelective(FilmPersonImg record);

    List<FilmPersonImg> selectByExample(FilmPersonImgExample example);

    FilmPersonImg selectByPrimaryKey(Integer personImg);

    int updateByExampleSelective(@Param("record") FilmPersonImg record, @Param("example") FilmPersonImgExample example);

    int updateByExample(@Param("record") FilmPersonImg record, @Param("example") FilmPersonImgExample example);

    int updateByPrimaryKeySelective(FilmPersonImg record);

    int updateByPrimaryKey(FilmPersonImg record);
}