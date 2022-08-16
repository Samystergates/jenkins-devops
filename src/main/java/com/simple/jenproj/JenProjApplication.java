package com.simple.jenproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class JenProjApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(JenProjApplication.class, args);
		System.out.println("running");

	}

	
	@GetMapping("/")
	public String welcome() {
		
		return "welcome to jenops";
	}
}
