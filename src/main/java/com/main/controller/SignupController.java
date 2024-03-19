package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.main.bo.SignUp;
import com.main.service.SignupManagementImpl;

@Controller
public class SignupController {

	@Autowired
	private SignupManagementImpl service;

	@GetMapping("/")
	public String signUP() {

		return "index";
	}

	@PostMapping("signupProcess")
	public String signupProcess(@ModelAttribute("signup") SignUp signUp) {

		if (service.isSignup(signUp)) {
			return "success-page";
		} else {
			return "fail-page";
		}
	}

}
