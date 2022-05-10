package com.deimosSpace.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.deimosSpace.app.model.User;
import com.deimosSpace.app.model.UserStats;

@Service
public class UserService implements UserServiceIF {

	@Override
	public List<User> getAll() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://gorest.co.in/public/v1/users),";
		ResponseEntity<User[]> response = restTemplate.getForEntity(url, User[].class);
		ArrayList<User> list = new ArrayList<User>();
		for(int i = 0; i < response.getBody().length; ++i) {
			list.add(response.getBody()[i]);
		}
		return list;
	}

	@Override
	public User getByName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserStats getStats() {
		// TODO Auto-generated method stub
		return null;
	}

}
