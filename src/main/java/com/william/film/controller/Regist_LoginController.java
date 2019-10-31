package com.william.film.controller;

import com.william.film.pojo.Customer;
import com.william.film.service.LoginService;
import com.william.film.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Regist_LoginController {
//    private LoginServiceImpl loginService;
    @Autowired
    LoginService loginService;
    @Autowired
    RegisterService registerService;

    /**
     * 进入注册页面
     * @return
     * @throws Exception
     */
    @RequestMapping("/regist")
    public String regist()throws Exception{
        return "regist";
    }

    /**
     * 新用户注册方法
     * @param customer
     * @return
     * @throws Exception
     */
    @RequestMapping("/regist/NewUser")
    @ResponseBody String registNewUser(Customer customer)throws Exception{
        registerService.Register(customer);
        return "movieItem";
    }
    @RequestMapping("/regist/NameCheck")
    @ResponseBody boolean registNameCheck(Customer customer)throws Exception{
        //有重名的则为false,无重名则为true
       return registerService.RegisterNameCheck(customer.getCustomerName());
    }
    @RequestMapping("/login")
    public String login(Customer customer)throws Exception{
        System.out.println(customer.getCustomerName());
        return "login";
    }


    /**
     * 通过账号名检查用户密码是否与输入密码一致
     * @param customer
     * @return
     * @throws Exception
     */
    @RequestMapping("/checkLogin")
    //ResponseBody返回的是json值
    @ResponseBody boolean checklogin(Customer customer)throws Exception{
        return loginService.checkLogin(customer);
    }
    @RequestMapping("/insertTest")
    public String insertTest(Customer customer)throws Exception{
        registerService.Register(customer);
        return "regist";

    }
}
