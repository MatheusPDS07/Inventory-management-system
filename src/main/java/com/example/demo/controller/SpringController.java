package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringController {

	@GetMapping("/")
	public String login() {
		return "index";
	}

	@GetMapping("/sendData")
	public String menu() {
		return "sendData";
	}

	@GetMapping("/error")
	public String error() {
		return "error";
	}
}
