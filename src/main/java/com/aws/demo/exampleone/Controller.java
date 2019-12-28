package com.aws.demo.exampleone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {
	
	@GetMapping
	public String hello() {
		return "hello tech this form my code..     change    111";
	}
}
