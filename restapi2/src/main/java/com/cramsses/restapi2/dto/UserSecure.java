package com.cramsses.restapi2.dto;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.annotation.sql.DataSourceDefinition;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSecure {
	
	

	public UserSecure(String user, String pass, String token) {
		super();
		this.user = user;
		this.pass = pass;
		this.token = token;
	}


	@JsonIgnore
	private String user;

	@JsonIgnore
	private String pass;

	private String token;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	

}
