package com.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mybatis.mapper.Mapper;
import com.mybatis.models.User;

@Component
public class UserService {

	@Autowired
	private Mapper mapper;
	
	public List<User> getAllUsers() {
	    return mapper.getAllUsers();
	  }
	
	public List<User> getAllUsers2() {
	    return mapper.getAllUsers2();
	  }
	
	public List<User> getAllUsersSP(){
		return mapper.getAllUsersSP();
	}
}
