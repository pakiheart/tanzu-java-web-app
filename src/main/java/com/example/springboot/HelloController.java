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
	@RequestMapping("/test1")
	public String test1() {
		return "Greetings from Spring Boot + Tanzu! - Test1";
	}
}