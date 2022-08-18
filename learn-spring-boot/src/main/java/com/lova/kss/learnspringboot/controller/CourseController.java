package com.lova.kss.learnspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lova.kss.learnspringboot.bean.Course;

@RestController
public class CourseController {

	@GetMapping("/courses")
    public List<Course> getAllCourses() {
		return Arrays.asList(new Course(1, "Java 8 ", "Lova Chittumuri"),new Course(2, "Spring Microservices ", "Karuna Chittumuri"));
	}
	
	@GetMapping("/courses/{id}")
    public Course getAllCourses(@PathVariable long id) {
		return (new Course(2, "Spring Microservices ", "Karuna Chittumuri"));
	}
	
	
}
