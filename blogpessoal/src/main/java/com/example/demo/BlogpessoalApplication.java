package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.example.demo.model") 
@SpringBootApplication
@RestController
@RequestMapping("/")

public class BlogpessoalApplication {
	@GetMapping
	public ModelAndView swaggerUi() {
	return new ModelAndView("redirect:/swagger-ui/");
	}
	
	public static void main(String[] args) {
	SpringApplication.run(BlogpessoalApplication.class, args);
	}
	}