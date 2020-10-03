package com.casso.admintool.rest.service;

import com.casso.admintool.rest.entities.User;
import com.casso.admintool.rest.repositories.UserRepository;

public class UserService {

    UserRepository userRepository;

	public User saveAndFlush(User user) {
		return userRepository.saveAndFlush(user);
	}

	public User update(User user) {
		return userRepository.save(user);
	}

	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public User findById(Integer id) {
		return userRepository.findById(id);
	} 
    
}
