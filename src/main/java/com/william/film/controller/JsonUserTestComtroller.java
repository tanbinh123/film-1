package com.william.film.controller;

import com.william.film.pojo.Usertest;
import com.william.film.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 为了方便项目前后端分离,后端项目SpringBoot一般会提供一个类用于返回JSON数据
 * 使用@RestController声明的类,所有操作,都只会返回JSON格式数据
 */
@RestController
@RequestMapping("/jsonUserTest")
public class JsonUserTestComtroller {
    @Autowired
    UserTestService userTestService;

    /**
     * 返回单个对象
     * @param uid
     * @return
     */
    @RequestMapping("/showUsertest/{uid}")
    public Usertest selectUser(@PathVariable int uid){
        return  userTestService.selectUser(uid);
    }

    @RequestMapping("/showAllUsers")
    public List<Usertest> findAllUsers(){
        return userTestService.findAllUsers();
    }

    @RequestMapping("/showUsers2")
    public List<Usertest>selectUser2(){
        Usertest usertest = new Usertest();
        usertest.setUname("william");
        usertest.setUpwd("123");
        return userTestService.findUserByUnameUpwd(usertest);
    }
}
