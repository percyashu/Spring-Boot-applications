package com.ashu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigurationProperties(value=MyMessage.class)
@SpringBootApplication
@RestController
public class SpringDemoApplication {
	@Autowired
	private MyMessage myMessage;
	@Autowired
	ApplicationArguments args;
	@RequestMapping("/")
	public String welcome() {
		String value =args.getOptionNames().iterator().next();
		return "Welcome "+value;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
