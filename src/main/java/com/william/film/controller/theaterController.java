package com.william.film.controller;

import com.william.film.mapper.MovieMapper;
import com.william.film.pojo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;

@Controller
public class theaterController {
    @Autowired
    MovieMapper movieMapper;
    @RequestMapping("/theater")
    public String toPage(@RequestParam(value = "movieId",required = false,defaultValue = "1")Integer a, Model model)throws Exception{
        Movie movie = movieMapper.selectByPrimaryKey(a);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String releaseDate = sdf.format(movie.getMovieRelease());
        model.addAttribute("releaseDate",releaseDate);
        model.addAttribute("movie",movie);

        System.out.println("接收的值"+a);
        return "theater";
    }
}
