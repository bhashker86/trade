package com.trade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import com.trade.model.*;
import java.util.*;
import com.trade.service.*;


@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("api/v1/user")
public class UserController {

	@Autowired
	private UserService user_service;

	@GetMapping("/getUser")
	public List<User> getUser() {
	  return user_service.getUsers();
 }
	
	
}
