package com.william.film.service.Impl;

import com.william.film.mapper.CustomerMapper;
import com.william.film.pojo.Customer;
import com.william.film.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    CustomerMapper customerMapper;
    @Override
    public boolean checkLogin(Customer customer) {
        System.out.println("输入的姓名:"+customer.getCustomerName());
        System.out.println("输入的密码:"+customer.getCustomerPwd());
        System.out.println("数据库中查出的密码:"+customerMapper.selectPwdByName(customer.getCustomerName()));
        try {
            if (customerMapper.selectPwdByName(customer.getCustomerName()).equals(customer.getCustomerPwd())){
                return true;
            }else{
                return false;
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public int getId(String customerName) {
        return customerMapper.selectIdByName(customerName);
    }
}
