package com.niit.hello.DAO;

import com.niit.hello.model.User;

public interface UserDao {

	void registerUser(User user);
	boolean isEmailUnique(String email);
	User login(User user);
	void update(User validUser);
	User getUser(String email);
	void updateUser(User user);
}
