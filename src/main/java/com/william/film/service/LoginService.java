package com.william.film.service;

import com.william.film.pojo.Customer;

public interface LoginService {
    /**
     * 检查登录密码是否匹配登录账户
     * @param customer
     * @return
     */
    boolean checkLogin(Customer customer);
}
