package com.shahrukk.shahrukhDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

	@RequestMapping("/welcome")
	public String hello() {
		return "{\"message\": \"Hello and welcome to secure world.\"}";
	}

}
