package com.lova.jpah2entitymanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lova.jpah2entitymanager.repository.CourseRepository;

@RestController
public class CourseController {

	
	@Autowired
	CourseRepository curseRepository;	
	
	@GetMapping("/home")
	public String home() {
		curseRepository.saveObject();
		return "Lova Chittumuri";
		
	}
	
	

}
