package com.studentmgmt.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@RequestMapping("/")
	public String home() {
		return "server started successfully !";
	}
}
