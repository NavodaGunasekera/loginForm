package com.app.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.login.model.User;
import com.app.login.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository repo;
	
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	/*public User fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}*/

	public User fetchUserByEmailIdAndPassword(String email, String password) {
		return repo.findByEmailIdAndPassword(email, password);
	}

}