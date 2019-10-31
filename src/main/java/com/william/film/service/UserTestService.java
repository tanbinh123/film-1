package com.william.film.service;


import com.william.film.pojo.Usertest;

import java.util.List;

public interface UserTestService {
	Usertest selectUser(int uid);
	boolean checkRegist(Usertest usertest);
	List<Usertest>findAllUsers();
	List<Usertest>findUserByUnameUpwd(Usertest usertest);
}