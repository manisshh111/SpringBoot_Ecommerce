package com.manish.service;

import com.manish.exception.UserException;
import com.manish.model.User;

public interface UserService {

	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJWT(String jwt) throws UserException;
}
