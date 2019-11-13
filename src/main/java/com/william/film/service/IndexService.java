package com.william.film.service;

import com.william.film.pojo.Customer;
import com.william.film.pojo.Movie;

import java.util.List;

public interface IndexService {
    /**
     * 正在热映x8
     * @return 八个Movie对象
     */
    List<Movie>nowShowingEight();

    /**
     * 今日票房ranking/只读出10条排序
     * @return
     */
    List<Movie>todayBoxRank10();

    /**
     * 显示即将上映影片
     * @return
     */
    List<Movie>upComingEight();

    /**
     * 返回最受期待的十部电影
     * @return
     */
    List<Movie>exceptRankTen();

    /**
     * 通过用户ID获得用户对象
     * @param customerId
     * @return
     */
    Customer getCustomerById(Integer customerId);
}
