package com.deimosSpace.app.service;

import java.util.List;

import com.deimosSpace.app.model.User;
import com.deimosSpace.app.model.UserStats;

public interface UserServiceIF {

	List<User> getAll();
	
	User getByName(String username);
	
	UserStats getStats();
}
