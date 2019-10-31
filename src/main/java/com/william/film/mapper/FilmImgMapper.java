package com.william.film.mapper;

import com.william.film.pojo.FilmImg;
import com.william.film.pojo.FilmImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilmImgMapper {
    long countByExample(FilmImgExample example);

    int deleteByExample(FilmImgExample example);

    int deleteByPrimaryKey(Integer filmImg);

    int insert(FilmImg record);

    int insertSelective(FilmImg record);

    List<FilmImg> selectByExample(FilmImgExample example);

    FilmImg selectByPrimaryKey(Integer filmImg);

    int updateByExampleSelective(@Param("record") FilmImg record, @Param("example") FilmImgExample example);

    int updateByExample(@Param("record") FilmImg record, @Param("example") FilmImgExample example);

    int updateByPrimaryKeySelective(FilmImg record);

    int updateByPrimaryKey(FilmImg record);
}