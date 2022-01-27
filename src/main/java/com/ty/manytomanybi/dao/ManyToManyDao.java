package com.ty.manytomanybi.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytomanybi.dto.Course;
import com.ty.manytomanybi.dto.Student;

public class ManyToManyDao {
	EntityManagerFactory entityManagerFactory;
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public EntityManager getEntityManager() {
		entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		return entityManagerFactory.createEntityManager();

	}

	public void addCourse(Course course) {
		EntityManager entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(course);
		entityTransaction.commit();
	}

	public void deleteCourse(int id) {
		EntityManager entityManager = getEntityManager();

		Course course = entityManager.find(Course.class, id);
		if (course != null) {
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(course);
			entityTransaction.commit();
		}
	}

	public Course getCourse(int id) {
		EntityManager entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Course course = entityManager.find(Course.class, id);
		entityTransaction.commit();
		return course;

	}

	public void updateCourse(List<Student> list, int id) {
		EntityManager entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.find(Course.class, id).getList().addAll(list);
		entityTransaction.commit();
	}

	public void addStudent(Student student) {
		EntityManager entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
}
