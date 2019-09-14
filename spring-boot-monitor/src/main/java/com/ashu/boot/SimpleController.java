package com.ashu.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@RequestMapping("/excute")
	public String execute() {
		return "invoked";
	}
}
