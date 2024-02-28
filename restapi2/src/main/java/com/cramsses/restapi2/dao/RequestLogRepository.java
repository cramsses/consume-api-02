package com.cramsses.restapi2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cramsses.restapi2.model.RequestLog;

public interface RequestLogRepository extends JpaRepository<RequestLog, Integer> {

	
}
