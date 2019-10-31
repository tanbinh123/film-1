package com.william.film.mapper;

import com.william.film.pojo.Usertest;
import com.william.film.pojo.UsertestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UsertestMapper {

    @Select("SELECT * FROM usertest WHERE uid = #{uid}")
    Usertest selectUser(int uid);

    /**
     * 用户注册方法
     * @param usertest
     * @return
     */
    int addUser(Usertest usertest);

    /**
     * 查询多个数据
     * @return
     */
    @Select("SELECT * FROM usertest")
    List<Usertest> findAllUsers();
    int countByExample(UsertestExample example);

    int deleteByExample(UsertestExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Usertest record);

    int insertSelective(Usertest record);

    List<Usertest> selectByExample(UsertestExample example);

    Usertest selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Usertest record, @Param("example") UsertestExample example);

    int updateByExample(@Param("record") Usertest record, @Param("example") UsertestExample example);

    int updateByPrimaryKeySelective(Usertest record);

    int updateByPrimaryKey(Usertest record);


}