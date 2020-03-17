package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	public DemoController()
	{
		System.out.print("dddddđsssssssssssssss");
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}

}
