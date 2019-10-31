package com.william.film.controller;

import com.william.film.pojo.Usertest;
import com.william.film.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserTestController {

    @Autowired
    UserTestService userTestService;
    @RequestMapping("/welcome")
    public String welcome()throws Exception{
        System.out.println("访问templates下的welcome页面");
        return"welcome";
    }
    //访问 http://localhost:8090/film/showUsertest/1   查询相关信息
    @ResponseBody
    @RequestMapping("/showUsertest/{uid}")
    public String selectUser(@PathVariable int uid){
        return  userTestService.selectUser(uid).toString();
    }

    @PostMapping("/testRegist")
    public String testRegist(Model model,Usertest usertest){
        System.out.println("前台获取到:"+usertest.getUname());
        boolean result = userTestService.checkRegist(usertest);
        if(result){
            model.addAttribute("msg","注册成功");
            model.addAttribute("user",usertest);

        }else{
            model.addAttribute("msg","注册失败");
        }
        return"welcome";
    }
    @GetMapping("/showUsers")
    public String showUsers(Model model) throws Exception{
        List<Usertest> users = userTestService.findAllUsers();
        model.addAttribute("users",users);
        return "allUsers";
    }
}

