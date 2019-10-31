package com.william.film.service.Impl;

import com.william.film.mapper.MovieMapper;
import com.william.film.pojo.Movie;
import com.william.film.service.MovieItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieItemServiceImpl implements MovieItemService{
    @Autowired
    MovieMapper movieMapper;
    @Override
    public Movie selectMovieById(Integer id) {
        return movieMapper.selectByPrimaryKey(id);
    }
}
