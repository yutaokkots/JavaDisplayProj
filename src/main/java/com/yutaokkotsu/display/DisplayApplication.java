package com.yutaokkotsu.display;

// contains a method called 'run'
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // initialized with http://localhost:8080

public class DisplayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayApplication.class, args);
	}

	@GetMapping("/") // '@GetMapping' makes it known that 'apiRoot' is an endpoint.
	public String apiRoot(){
		return "Hello World!";
	}
}
