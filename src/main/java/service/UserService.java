package service;

import domain.User;

import java.util.List;


public interface UserService {
	public String getEmail(String email);
	public void update(User user);

}
