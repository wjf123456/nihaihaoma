package service;


import domain.User;

import java.util.List;

public interface LoginService {
	User login(User user);
	List<User> list();

}
