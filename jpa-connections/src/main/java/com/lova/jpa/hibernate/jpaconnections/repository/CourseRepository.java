package com.lova.jpa.hibernate.jpaconnections.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lova.jpa.hibernate.jpaconnections.entity.Course;

@Repository
public class CourseRepository {

	@Autowired
	EntityManager entityManager;

	public Course findById(Long id) {
		return entityManager.find(Course.class, id);
	}

}
