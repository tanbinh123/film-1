package com.william.film.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomeController{
    @RequestMapping("/")
    public String welcome() throws Exception{
        return"index";
    }
}
