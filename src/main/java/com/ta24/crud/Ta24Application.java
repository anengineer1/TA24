package com.ta24.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Ta24Application {

	public static void main(String[] args) {
		SpringApplication.run(Ta24Application.class, args);
	}
	
//	@GetMapping("/test")
//	public String test() {
//		return String.format("Prueba de fuego", null);
//	}
}
