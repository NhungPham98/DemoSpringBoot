package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping("/userList")
	public String Userpage() {
		return "userList";
	}
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/userEdit/{id}")
	public String Edit (@PathVariable(value="id") int id, Model model){
		User user= new User();
		user = service.findById(id);
		model.addAttribute("user",user);
		return "userEdit";
	}
	
	@RequestMapping("/delete/{id}")
	public String DeleteUser(@PathVariable(value="id") int id) {
		  service.deleteById(id);
		return "userList";
	}
	
	@RequestMapping("/change")
	public String UpdateUser(User user) {
		service.update(user);
		return "userList";
	}


}
