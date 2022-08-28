package com.lova.jpah2entitymanager.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lova.jpah2entitymanager.entity.Course;

@Repository
@Transactional
public class CourseRepository {

	@Autowired
	EntityManager entityManager;

	public Course findById(Long id) {
		return entityManager.find(Course.class, id);
	}

	public void saveObject() {
		entityManager.persist(new Course("Better Books"));
	}

}
