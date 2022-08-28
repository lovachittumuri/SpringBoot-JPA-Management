package com.lova.jpah2entitymanager;



import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lova.jpah2entitymanager.entity.Course;

@SpringBootApplication
public class JpaH2EntityManagerApplication implements CommandLineRunner {

	@Autowired
	EntityManager em;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaH2EntityManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		em.persist(new Course("Better Books"));
		
	}

}
