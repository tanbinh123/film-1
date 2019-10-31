package com.william.film.mapper;

import com.william.film.pojo.Customer;
import com.william.film.pojo.CustomerExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CustomerMapper {
    /**
     * 通过名字查询密码
     * @param customerName
     * @return
     */
    @Select("select Customer_Pwd from customer where Customer_Name = #{customerName}")
    String selectPwdByName(String customerName);
//    //@Select("insert into customer(Customer_Name,Customer_Email,Customer_Phone,Customer_Pwd,Customer_Creat_Time,Customer_Level) values('wang','923340695@qq.com',15061128789,123,'2019-10-13 19:18:00',1);")
//    @Select("insert into customer(Customer_Name,Customer_Email,Customer_Phone,Customer_Pwd,Customer_Creat_Time,Customer_Level) values('#{customer.getCustomerName}','923340695@qq.com',15061128789,123,'2019-10-13 19:18:00',1);")
//    int insertCustomer(Customer customer);
    @Select("select Customer_Name from customer where Customer_Name = #{customerName}")
    String selectNameByName(String customerName);
    long countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}