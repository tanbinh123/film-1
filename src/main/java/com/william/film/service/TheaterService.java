package com.william.film.service;

import com.william.film.pojo.Area;
import com.william.film.pojo.Brand;
import com.william.film.pojo.Theater;

import java.util.List;

public interface TheaterService {
    /**
     * 通过城市名找城市所有电影院品牌
     * @param cityName
     * @return
     */
    List<Brand>findBrandsByCityName(String cityName);

    /**
     * 通过城市名找地区
     * @param cityName
     * @return
     */
    List<Area>findAreasByCityName(String cityName);

    /**
     * 通过电影院所处区或者品牌名查电影院
     * @param area
     * @param brand
     * @return
     */
    List<Theater>selectTheaterByAreaBrand(String area,String brand);

    /**
     * 通过影院id查找影院名
     * @param theaterId
     * @return
     */
    String findTheaterNameById(Integer theaterId);
}
