package com.william.film;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//如果需要使用注解进行SQL语句绑定,指定扫描mapper包下的接口
@MapperScan("com.william.film.mapper")
@SpringBootApplication
public class FilmApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmApplication.class, args);
	}

}
