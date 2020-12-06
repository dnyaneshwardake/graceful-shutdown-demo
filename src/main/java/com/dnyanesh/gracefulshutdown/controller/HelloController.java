package com.dnyanesh.gracefulshutdown.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	private String hello() throws Exception {

		Thread.currentThread().sleep(5000);
		return "Welcome..";
	}
}
