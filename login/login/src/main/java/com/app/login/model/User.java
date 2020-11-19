package com.app.login.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;


@Entity
public class User {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private String EmailId;
	private String password;
	
	
	public User() {
	}
	
	public User(String emailId, String password) {
		super();
		this.EmailId = emailId;
		this.password = password;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	

	
}
