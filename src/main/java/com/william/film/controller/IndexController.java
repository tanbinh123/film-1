package com.william.film.controller;

import com.william.film.pojo.Movie;
import com.william.film.service.Impl.IndexServiceImpl;
import com.william.film.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    IndexServiceImpl indexService;
    @RequestMapping("index")
    public String index(Model model)throws Exception{
        if(null!=indexService.nowShowingEight()){
            System.out.println("not null");
            System.out.println(indexService.nowShowingEight().toString());

        }else{
            System.out.println("is null");
        }
        //对第一/第二-第三/第四-第十进行分层
//        Date date = new Date();
//        System.out.println("date: "+date);
//Mapper可以直接传date到数据库中,不用SimpleDateFormat转换
//        for (Movie movie:indexService.upComingEight()
//             ) {
//            System.out.println(movie.toString());
//        }
        List<Movie>oneToTen = indexService.todayBoxRank10();
        oneToTen.remove(0);
        Movie top1Saler = oneToTen.get(0);
        List<Movie>twoToThree = new ArrayList<>();
        twoToThree.add(oneToTen.get(1));
        twoToThree.add(oneToTen.get(2));
        oneToTen.remove(1);
        oneToTen.remove(2);


        //最受期待排行
        List<Movie>exceptOneToTen = indexService.exceptRankTen();
        System.out.println("-----------------------------------");
        for (Movie movie:exceptOneToTen
                ) {
            System.out.println(movie.toString());
        }
        Movie except1 = exceptOneToTen.get(0);
        Movie except2 = exceptOneToTen.get(1);
        Movie except3 = exceptOneToTen.get(2);
        exceptOneToTen.remove(2);
        exceptOneToTen.remove(1);
        exceptOneToTen.remove(0);
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        for (Movie movie:exceptOneToTen
                ) {

            System.out.println(movie.toString());
        }



        model.addAttribute("except1",except1);
        model.addAttribute("except2",except2);
        model.addAttribute("except3",except3);
        model.addAttribute("exceptFourToTen",exceptOneToTen);

        model.addAttribute("movieRank1",top1Saler);
        model.addAttribute("movieRank2And3",twoToThree);
        model.addAttribute("fourToTen",oneToTen);
        model.addAttribute("movie8",indexService.nowShowingEight());
        model.addAttribute("upComingEight",indexService.upComingEight());
        return "index";
    }
    @RequestMapping("countDownTest")
    public String countdown(){
        return "CountDownTest";
    }
}
