package com.casso.admintool.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class AdminToolApiInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AdminToolApiInitializer.class, args);
	}

	@GetMapping("/")
	public String hello(@RequestParam(value = "name", defaultValue = "There") String name) {
		return String.format("Hi %s!", name);
	}

}
