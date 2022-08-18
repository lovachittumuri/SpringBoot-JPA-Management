package com.lova.kss.learnspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/{name}")
	public String home(@PathVariable("name") String myName) {
		return "Good Morning...!  " + myName;
	}

}
