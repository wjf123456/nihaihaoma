package service.impl;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reporsitory.Userreporsitory;


import service.SignInService;

@Service
public class SignInServiceImpl implements SignInService{
	
	@Autowired
	private Userreporsitory userreporsitory;

	@Override
	public void signIn(User user) {
		userreporsitory.save(user);
	}
}
