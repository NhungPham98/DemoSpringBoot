package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ResponeData;
import com.example.demo.model.User;

@RestController
public class RestFuntionController {
	@PostMapping("/ChangeUser")
	public ResponeData Change() {
		ResponeData  restponedata = new ResponeData(); 
		restponedata.setStt("thanh cong");
		User user=new User();
		user.setUsername("a");
		user.setPass("1233");
		restponedata.setStuden(user);
		
		return restponedata;
	}
}
