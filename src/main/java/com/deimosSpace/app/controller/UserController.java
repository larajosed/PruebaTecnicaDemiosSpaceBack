package com.deimosSpace.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.deimosSpace.app.model.User;
import com.deimosSpace.app.model.UserStats;
import com.deimosSpace.app.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("users")
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public List<User> getUsers(){
		return userService.getAll();
	}
	
	@GetMapping("users/stats")
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public UserStats getUserStats() {
		return null;
	}
	
	@PutMapping("users/name")
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public User putUser(@RequestBody String name) {
		return null;
	}
	
	
}
