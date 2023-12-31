package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot + Tanzu!";
	}
	@RequestMapping("/test")
	public String test() {
		return "Greetings from Spring Boot + Tanzu! - Test";
	}
	@RequestMapping("/helloworld")
	public String helloworld() {
		return "Hello World!";
	}	
}