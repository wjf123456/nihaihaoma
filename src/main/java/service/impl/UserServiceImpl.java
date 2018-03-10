package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reporsitory.Userreporsitory;

import domain.User;
import service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private Userreporsitory userreporsitory;

	@Override
	public String getEmail(String email) {
		return userreporsitory.getEmail(email);
	}

	@Override
	public void update(User user) {
		userreporsitory.update(user);

	}


	
	

}
