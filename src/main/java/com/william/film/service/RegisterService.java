package com.william.film.service;

import com.william.film.pojo.Customer;
import org.springframework.stereotype.Service;

@Service
public interface RegisterService {
    /**
     * 注册测试方法
     * @param customer
     * @return
     */
    int RegisterTest(Customer customer);
    int Register(Customer customer);

    /**
     * 检查用户名是否重复
     * @param customerName
     * @return
     */
    boolean RegisterNameCheck(String customerName);
}
