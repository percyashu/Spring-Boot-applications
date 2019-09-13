package com.ashu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootToolsApplication {
	@RequestMapping("/")
	public String hello() {
		return "Hello spring user automatic live reload enable ";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootToolsApplication.class, args);
	}

}
