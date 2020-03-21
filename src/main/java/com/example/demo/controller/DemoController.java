package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;

@Controller
public class DemoController {
	public DemoController() {
		System.out.print("dddddđsssssssssssssss");
	}

	@RequestMapping("/")
	public String index() {
		return "index.html";
	}

	@RequestMapping("/login")
	public String Login() {
		return "login";
	}

	@PostMapping("/submitlogin")
	public ModelAndView SubmitLogin(@ModelAttribute("user") User user) {
		ModelAndView model = new ModelAndView("userEdit");
		model.addObject("user", user);
		return model;
	}

}
