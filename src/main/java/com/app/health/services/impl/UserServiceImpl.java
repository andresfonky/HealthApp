package com.app.health.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.health.database.dao.UserDAO;
import com.app.health.database.entities.UserEntity;
import com.app.health.domain.User;
import com.app.health.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public User saveUser(User user) {
		UserEntity entity = userConverter.domainToEntity(user);
		return null;
	}
}
