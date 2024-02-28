package com.cramsses.restapi2.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cramsses.consumeapi1.user.UserService;
import com.cramsses.consumeapi1.user.pojo.*;

@Service
public class UserAPIService {
	
	
	//Get all user
	public List<User> getAllUsers() {
		
		//Get all user method
		UserService service = new UserService();
		List <User>users = service.getAllUsers();
		
		
		//Log request
		System.out.println("Accesing to GET_USERS at "+Calendar.getInstance().getTime());

		return users;

	}
	
	//Get user by id
	public User getUser( Integer id) {
		//Get user by Id
		UserService service = new UserService();
		User user = service.getUser(id);

		//Log Request
		System.out.println("Accesing to GET_USER at "+Calendar.getInstance().getTime());
		
		return user;

	}
	
	


}
