package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import reporsitory.Userreporsitory;
import service.CheckEmailExistService;

@Service
public class CheckEmailExistServiceImpl implements CheckEmailExistService {

	@Autowired
	private Userreporsitory userreporsitory;
	
	@Override
	public boolean checkEmailExist(String uEmail) {
		if(userreporsitory.getEmail(uEmail) == null || "".equals(userreporsitory.getEmail(uEmail))) {
			return false;
		}
		return true; //返回真則郵箱存在
	}



	
}
