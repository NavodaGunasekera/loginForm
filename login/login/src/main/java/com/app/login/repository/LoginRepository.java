package com.app.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.login.model.User;

public interface LoginRepository extends JpaRepository<
User, Integer>{
	
	//public User findByEmailId(String emailId);
	public User findByEmailIdAndPassword(String emailId, String password);

}
