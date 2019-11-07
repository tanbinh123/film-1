package com.william.film.controller;

import com.william.film.mapper.BrandMapper;
import com.william.film.mapper.MovieMapper;
import com.william.film.pojo.Brand;
import com.william.film.pojo.Movie;
import com.william.film.pojo.Theater;
import com.william.film.service.MovieItemService;
import com.william.film.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class TheaterController {
    @Autowired
    MovieItemService movieItemService;
    @Autowired
    TheaterService theaterService;

    @RequestMapping("/theater")
    public String toPage(@RequestParam(value = "movieId", required = false, defaultValue = "1") Integer a, Model model, String area, String brand) throws Exception {
//        Movie movie = movieMapper.selectByPrimaryKey(a);
        Movie movie = movieItemService.selectMovieById(a);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String releaseDate = sdf.format(movie.getMovieRelease());
        //banner所显示的电影的讯息
        model.addAttribute("releaseDate", releaseDate);
        model.addAttribute("movie", movie);
        System.out.println("接收的值" + a);
        //需要将地区名传入
        //添加影院
        model.addAttribute("theaterBrand", theaterService.findBrandsByCityName("南京"));
        //添加地区
        model.addAttribute("area", theaterService.findAreasByCityName("南京"));


        return "theater";
    }

    @RequestMapping("/getTheater")
    @ResponseBody
    List<Theater> getTheater(String area, String brand) {
        System.out.println("area:" + area);
        System.out.println("brand:" + brand);
        if (area != null) {
            System.out.println("area不为null");
        } else {
            System.out.println("area为null");
        }
        for (Theater t : theaterService.selectTheaterByAreaBrand(area, brand)
                ) {
            System.out.println(t.toString());
        }
        return theaterService.selectTheaterByAreaBrand(area, brand);
    }
}
