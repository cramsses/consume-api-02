package com.cramsses.restapi2.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cramsses.consumeapi1.user.UserService;
import com.cramsses.consumeapi1.user.pojo.*;
import com.cramsses.restapi2.dao.RequestLogRepository;
import com.cramsses.restapi2.model.RequestLog;

@Service
public class UserAPIService {
	
	@Autowired
	private RequestLogRepository logRepository;
	
	//Get all user
	public List<User> getAllUsers() {
		
		//Get all user method
		UserService service = new UserService();
		List <User>users = service.getAllUsers();
		
		
		//Log request
		System.out.println("Accesing to GET_USERS at "+Calendar.getInstance().getTime());
		registerLogNow("GET_ALL_USERS");

		return users;

	}
	
	//Get user by id
	public User getUser( Integer id) {
		//Get user by Id
		UserService service = new UserService();
		User user = service.getUser(id);

		//Log Request
		System.out.println("Accesing to GET_USER at "+Calendar.getInstance().getTime());
		registerLogNow("GET_USER"+ id);
		
		return user;

	}
	
	private void registerLogNow(String name) {
		RequestLog log = null;
		log = new RequestLog(name, new Date());
		try {
			logRepository.save(log);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
	


}
