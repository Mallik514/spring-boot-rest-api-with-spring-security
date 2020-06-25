package com.mallik.spring.boot.simplespringbootapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping("/")
	public String index() {
		return "Rest Controller.";
	}

	public RestController() {
		super();
		System.out.println("Constructor of RestController");
	}
	
}
