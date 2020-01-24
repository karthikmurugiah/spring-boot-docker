package com.example.springbootdocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/sample/hello")
	public String returnHello() {
		return "Hello from " + System.getenv("HOSTNAME") + String.format("%n");
	}

}
