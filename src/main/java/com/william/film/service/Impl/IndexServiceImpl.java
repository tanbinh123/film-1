package com.william.film.service.Impl;

import com.william.film.mapper.MovieMapper;
import com.william.film.pojo.Movie;
import com.william.film.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    MovieMapper movieMapper;



    @Override
    public List<Movie> nowShowingEight() {
        return movieMapper.selectEightMovie();
    }
    @Override
    public List<Movie> todayBoxRank10() {
        return movieMapper.selectTenMovieByBox();
    }

    @Override
    public List<Movie> upComingEight() {
        return movieMapper.selectUpComingMoviex8(new Date());
    }

    @Override
    public List<Movie> exceptRankTen() {
        return movieMapper.selectByExceptx10(new Date());
    }
}
