package com.cramsses.restapi2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;

import com.cramsses.restapi2.controller.RequestLogController;
import com.cramsses.restapi2.dao.RequestLogRepository;
import com.cramsses.restapi2.model.RequestLog;

@ExtendWith(MockitoExtension.class)
public class RequestLogControllerTest {
	
	@InjectMocks
	RequestLogController requestLogController;
	
	@Mock
	RequestLogRepository logRepository;
	
	
	@Test
	public void testGetAllLogs() {
		
		RequestLog log1=new RequestLog("Service 1", new Date());
		RequestLog log2=new RequestLog("Service 2", new Date());
		List<RequestLog> logs = new ArrayList<RequestLog>();
		logs=Arrays.asList(log1,log2);
		
		when(logRepository.findAll()).thenReturn(logs);
		
		List<RequestLog> result= requestLogController.getAllLogs();
		
		assertThat(result.size()).isEqualTo(2);
		assertThat(result.get(0).getServiceName()).isEqualTo("Service 1");
	
	}

}
