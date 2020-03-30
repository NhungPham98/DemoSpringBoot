package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMyBatisRepository;
import com.example.demo.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserMyBatisRepository mapper;
	
	public List <User> findAll(){
		return mapper.findAll();
	}
	
	public User findById(int id) {
		return mapper.findById(id);
	}
	
	public int deleteById(int id) {
		return mapper.deleteById(id);
	}
	
	public int insert(User user) {
		return mapper.insert(user);
	}
	
	public int update(User user) {
		return mapper.update(user);
		
	}
}
