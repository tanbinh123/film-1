package com.william.film.controller;

import com.william.film.service.MovieItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;

@Controller
//@RequestMapping("/item")
public class MovieItemController {
    @Autowired
    MovieItemService movieItemService;
//    @RequestMapping("")
//    public String getAItem() throws Exception{
//        return "movie_item";
//    }
    @RequestMapping("/{movieID}")
    public String movie_item(@PathVariable("movieID")Integer id, Model model)throws Exception{
        model.addAttribute("movie",movieItemService.selectMovieById(id));
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String  a = sdf.format(movieItemService.selectMovieById(2).getMovieRelease());
        model.addAttribute("releaseDate",a);
        System.out.println("上映时间"+a);
//        System.out.println("我在这儿!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        System.out.println(movieItemService.selectMovieById(id).toString());
        return "movie_item";
    }
}
