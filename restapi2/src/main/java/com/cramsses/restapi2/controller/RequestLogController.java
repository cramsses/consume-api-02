package com.cramsses.restapi2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cramsses.restapi2.dao.RequestLogRepository;
import com.cramsses.restapi2.model.RequestLog;

@Controller
@RequestMapping("/log")
//CORS TODO 
public class RequestLogController {
	
	//Add service component as gateway
	@Autowired
	private RequestLogRepository logRepository;
	
	@RequestMapping("/all")
	@ResponseBody
	private List<RequestLog> getAllLogs(){
		List<RequestLog> logs = logRepository.findAll();
		return logs;
	}
	

}
