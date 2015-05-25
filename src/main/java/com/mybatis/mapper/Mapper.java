package com.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mybatis.models.User;

public interface Mapper {
	
	public List<User> getAllUsers();
	
	@Select("SELECT * FROM User")
	public List<User> getAllUsers2();
	
	
	public List<User> getAllUsersSP();

}
