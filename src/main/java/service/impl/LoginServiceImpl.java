package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import reporsitory.Logeporsitory;
import reporsitory.Userreporsitory;

import domain.Log;
import domain.User;
import service.LoginService;

import java.util.List;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	
	@Autowired
	private Userreporsitory userreporsitory;
	@Autowired
	private Logeporsitory logeporsitory;
	
	@Override
	@Transactional
	public User login(User user) {
		User temp = userreporsitory.get(user);
		if(temp != null) {
			
			Log log = new Log();
			log.setUser(temp);
			logeporsitory.save(log);

			userreporsitory.update(temp);
			
			return temp;
		} else {
			return null;
		}
	}

	@Override
	public List<User> list() {
		return userreporsitory.list();
	}


}
