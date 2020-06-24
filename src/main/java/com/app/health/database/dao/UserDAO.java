package com.app.health.database.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.health.database.entities.UserEntity;

public interface UserDAO extends CrudRepository<UserEntity, Long> {
	
	public UserEntity findById(int id);

}
