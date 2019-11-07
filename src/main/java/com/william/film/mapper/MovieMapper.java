package com.william.film.mapper;

import com.william.film.pojo.Movie;
import com.william.film.pojo.MovieExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MovieMapper {
//    @Select("select * from movie  order by Movie_Id limit 8")
    List<Movie> selectEightMovie();
    String a();
    List<Movie> selectTenMovieByBox();

    /**
     * 主页上筛选最近上映电影的方法
     * @param date
     * @return
     */
    List<Movie> selectUpComingMoviex8(Date date);

    /**
     * 筛选最受欢迎&即将上映&的10部电影
     * @param date
     * @return
     */
    List<Movie> selectByExceptx10(Date date);

    /**
     * 通过电影id
     * @param movieId
     * @return
     */
    Movie selectbyId(Integer movieId);
    long countByExample(MovieExample example);

    int deleteByExample(MovieExample example);

    int deleteByPrimaryKey(Integer movieId);

    int insert(Movie record);

    int insertSelective(Movie record);

    List<Movie> selectByExample(MovieExample example);

    Movie selectByPrimaryKey(Integer movieId);

    int updateByExampleSelective(@Param("record") Movie record, @Param("example") MovieExample example);

    int updateByExample(@Param("record") Movie record, @Param("example") MovieExample example);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKey(Movie record);
}