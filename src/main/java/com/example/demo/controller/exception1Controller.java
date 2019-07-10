package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class exception1Controller {
	
	@RequestMapping("/show1")
	public String show1() {
		String s = null;
		s.length();
		return "index";
		
	}
	@RequestMapping("/show")
	public String show() {
		int a = 10/0;
		return "index";
		
	}
	
}
