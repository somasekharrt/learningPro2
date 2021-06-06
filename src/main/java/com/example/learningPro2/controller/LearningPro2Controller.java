package com.example.learningPro2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class LearningPro2Controller {

	@GetMapping("/backendCall2")
	public String BackendCall() {
		return "2 pineapples";
	}
}
