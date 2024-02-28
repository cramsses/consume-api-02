package com.cramsses.restapi2.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RequestLog {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "SERVICE_NAME")
	private String serviceName;

	@Column(name = "REQUEST_TS")
	private Date request_ts;

	public RequestLog() {

	}

	public RequestLog(Integer id, String serviceName, Date request_ts) {
		super();
		this.id = id;
		this.serviceName = serviceName;
		this.request_ts = request_ts;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Date getRequest_ts() {
		return request_ts;
	}

	public void setRequest_ts(Date request_ts) {
		this.request_ts = request_ts;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("request_log [id=");
		builder.append(id);
		builder.append(", serviceName=");
		builder.append(serviceName);
		builder.append(", request_ts=");
		builder.append(request_ts);
		builder.append("]");
		return builder.toString();
	}

}
