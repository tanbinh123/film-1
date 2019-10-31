package com.william.film.service;

import com.william.film.pojo.Movie;

public interface MovieItemService {
    /**
     * 通过id查movie返回到movieitem页面
     * @param id
     * @return
     */
    Movie selectMovieById(Integer id);
}
