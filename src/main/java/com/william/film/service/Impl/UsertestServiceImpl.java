package com.william.film.service.Impl;

import com.william.film.mapper.UsertestMapper;
import com.william.film.pojo.Usertest;
import com.william.film.pojo.UsertestExample;
import com.william.film.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usertestService")
public class UsertestServiceImpl implements UserTestService {
    @Autowired
    UsertestMapper usertestMapper;
    @Override
    public Usertest selectUser(int uid){
        return usertestMapper.selectUser(uid);
    }

    @Override
    public boolean checkRegist(Usertest usertest) {
        int i = usertestMapper.addUser(usertest);
        if (i>0){
            return true;
        }
        return false;
    }

    @Override
    public List<Usertest> findUserByUnameUpwd(Usertest usertest) {
        UsertestExample example = new UsertestExample();
        UsertestExample.Criteria criteria = example.createCriteria();
        criteria.andUnameEqualTo(usertest.getUname());
        criteria.andUpwdEqualTo(usertest.getUpwd());
        List<Usertest>users = usertestMapper.selectByExample(example);
        // criteria.andUnameEqualTo(usertest.getUname());
        // criteria.andUpwdBetween("123","333");
        // List<Usertest>user2 = usertestMapper.selectByExample(example);
        return users;
    }

    @Override
    public List<Usertest> findAllUsers() {
        return usertestMapper.findAllUsers();
    }
}
