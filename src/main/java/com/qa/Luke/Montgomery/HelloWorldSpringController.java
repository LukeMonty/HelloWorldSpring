package com.qa.Luke.Montgomery;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSpringController {
	
	@RequestMapping("/")
	public String index() {
		
		return "Hello World, SPRINGBOOT!";
		
	}
}
