package com.lova.jpa.hibernate.jpaconnections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lova.jpa.hibernate.jpaconnections.entity.Course;
import com.lova.jpa.hibernate.jpaconnections.repository.CourseRepository;

@SpringBootApplication
public class JpaConnectionsApplication implements CommandLineRunner {

	public Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaConnectionsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course = repository.findById(1001L);
		logger.info("Course Name : "+course.getName());
	}

}
