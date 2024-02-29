package com.cramsses.restapi2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.cramsses.consumeapi1.user.pojo.*;
import com.cramsses.restapi2.service.UserAPIService;

@Controller
@RequestMapping("/user")
//CORS TODO 
public class UserAPIController {
	
	@Autowired
	private UserAPIService usrService;
	
	@RequestMapping("/status")
	@ResponseBody
	private String statusMessage() {
		String pattern = "MM/dd/yyyy HH:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern);
		Date today = Calendar.getInstance().getTime();
		return "USER REST API running at ... " + today;
	}
	
	
	//Get all users
	@RequestMapping("/all")
	@ResponseBody
	private List<User> getUsers() {
	
		List <User> users = usrService.getAllUsers();
		return users;

	}
	
	
	
	//Get user by ID
	@RequestMapping("/{id}")
	@ResponseBody
	private User getUser(@PathVariable Integer id){
		
		User user = usrService.getUser(id);
		return user;
	}
	
	

}
