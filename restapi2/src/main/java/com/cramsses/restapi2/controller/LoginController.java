package com.cramsses.restapi2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cramsses.restapi2.dto.UserSecure;
import com.cramsses.restapi2.security.JWTAuthtenticationConfig;

@RestController
public class LoginController {
	
	@Autowired
	JWTAuthtenticationConfig jwtAuthtenticationConfig;
	
	@PostMapping("login")
	public UserSecure login(
			@RequestParam("user") String username,
			@RequestParam("encryptedPass") String encryptedPass) {

		System.out.println("LOGIN");

		String token = jwtAuthtenticationConfig.getJWTToken(username);
		System.out.println(token);
		
		return new UserSecure(username, encryptedPass,token);
		//return token;
		
	}
	
	
	

}
