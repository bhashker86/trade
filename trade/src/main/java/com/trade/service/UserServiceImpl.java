package com.trade.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trade.model.User;
import com.trade.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository user_repo;
	
	public List<User> getUsers(){
	   List <User> user_list=new ArrayList<User>();
	   user_repo.findAll().forEach((e)->user_list.add(e));
	   return user_list;
	 
	}
	
}
