package com.manoj.microservices.clientserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

	@Value("${app.author}")
	String appAuthor;

	@GetMapping("/app-author")
	public String getAppAuthor() {
		return String.format("The application author is %s.", appAuthor);
	}
}
