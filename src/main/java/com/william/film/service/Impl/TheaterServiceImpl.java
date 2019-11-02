package com.william.film.service.Impl;

import com.william.film.mapper.AreaMapper;
import com.william.film.mapper.BrandMapper;
import com.william.film.mapper.TheaterMapper;
import com.william.film.pojo.Area;
import com.william.film.pojo.Brand;
import com.william.film.pojo.Theater;
import com.william.film.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TheaterServiceImpl implements TheaterService {
    @Autowired
    BrandMapper brandMapper;
    @Autowired
    AreaMapper areaMapper;
    @Autowired
    TheaterMapper theaterMapper;
    @Override
    public List<Brand> findBrandsByCityName(String cityName) {
        return brandMapper.findBrandByCityName(cityName);
    }
    @Override
    public List<Area> findAreasByCityName(String cityName) {
        return areaMapper.findAreasByCity(cityName);
    }

    @Override
    public List<Theater> selectTheaterByAreaBrand(String area, String brand) {
        return theaterMapper.selectTheaterByAreaBrand(area,brand);
    }
}
