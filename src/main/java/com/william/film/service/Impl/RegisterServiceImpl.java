package com.william.film.service.Impl;

import com.william.film.mapper.CustomerMapper;
import com.william.film.pojo.Customer;
import com.william.film.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class RegisterServiceImpl implements RegisterService{
    @Autowired
    CustomerMapper customerMapper;
    @Override
    public int RegisterTest(Customer customer) {
        customer.setCustomerName("william");
        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        customer.setCustomerCreatTime(date);
         customerMapper.insertSelective(customer);

        return 1;
    }


    /**
     * 插入一条完整的Customer数据
     * @param customer
     * @return
     */
    @Override
    public int Register(Customer customer) {
        Date date = new Date();
        customer.setCustomerCreatTime(date);
        customer.setCustomerLevel(1);
        try {
            customerMapper.insertSelective(customer);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 1;
    }
    @Override
    public boolean RegisterNameCheck(String customerName) {
        if(null!=customerMapper.selectNameByName(customerName)){
            return false;
        }else{
            return true;
        }
    }

}
