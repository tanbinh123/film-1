package com.william.film.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyConfiguration implements WebMvcConfigurer{
    /**
     * 配置图片资源虚拟路径
     * 未生效
     * @param registry
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //addResourceHandler内为映射路径,addResourceLocations
        //D:\Kadima’s\Demo\FilmProject_Img
        registry.addResourceHandler("/movieSrc/**").addResourceLocations("file:D:/Kadima’s/Demo/毕设相关/movieSrc/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
