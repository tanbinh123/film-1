package com.william.film.mapper;

import com.william.film.pojo.MovieActor;
import com.william.film.pojo.MovieActorExample;
import com.william.film.pojo.MovieActorKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovieActorMapper {
    long countByExample(MovieActorExample example);

    int deleteByExample(MovieActorExample example);

    int deleteByPrimaryKey(MovieActorKey key);

    int insert(MovieActor record);

    int insertSelective(MovieActor record);

    List<MovieActor> selectByExample(MovieActorExample example);

    MovieActor selectByPrimaryKey(MovieActorKey key);

    int updateByExampleSelective(@Param("record") MovieActor record, @Param("example") MovieActorExample example);

    int updateByExample(@Param("record") MovieActor record, @Param("example") MovieActorExample example);

    int updateByPrimaryKeySelective(MovieActor record);

    int updateByPrimaryKey(MovieActor record);
}