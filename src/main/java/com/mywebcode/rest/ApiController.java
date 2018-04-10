package com.mywebcode.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	
	
	@GetMapping("/home")
	@ResponseBody
	public String teste() {
		return "teste";
	}

	
	
}
