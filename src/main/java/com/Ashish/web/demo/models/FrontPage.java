package com.Ashish.web.demo.models;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontPage {
	
	
	@GetMapping()
	public String home() {
		return "Application is works!!!"+new Date();
	}
}
