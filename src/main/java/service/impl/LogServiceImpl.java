package service.impl;

import java.util.List;

import domain.Log;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import reporsitory.Logeporsitory;
import service.LogService;

@Service
public class LogServiceImpl implements LogService {
	
	@Autowired
	private Logeporsitory logeporsitory;

	@Override
	public void save(Log log) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<Log> select(User user) {
		return logeporsitory.select(user);
	}





}
