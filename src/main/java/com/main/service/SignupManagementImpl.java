package com.main.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.bo.SignUp;
import com.main.dao.ISingupRepository;

@Service
public class SignupManagementImpl implements ISignupManagement {

	@Autowired
	private ISingupRepository repo;

	@Override
	public boolean isSignup(SignUp signUp) {

		SignUp signUps = repo.save(signUp);


		if (signUps == null) {
			return false;
		} else {
			return true;
		}
	}

}
