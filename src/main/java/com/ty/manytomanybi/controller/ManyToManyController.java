package com.ty.manytomanybi.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.manytomanybi.dao.ManyToManyDao;
import com.ty.manytomanybi.dto.Course;
import com.ty.manytomanybi.dto.Student;

public class ManyToManyController {

	public static void main(String[] args) {
		ManyToManyDao dao=new ManyToManyDao();
		List<Student> list=new ArrayList<Student>();
		//------------------------------------
	/*	Student student=new Student();
		Student student2=new Student();
		Student student3=new Student();
		student.setName("david");
		student.setsId(1);
		student2.setName("james");
		student2.setsId(2);
		student3.setName("john");
		student3.setsId(3);
		list.add(student3);
		list.add(student2);
		list.add(student);
		//----------------------------------
		Course course=new Course();
		course.setcId(10);
		course.setName("C");
		course.setList(list);
		dao.addCourse(course); */
		 Student student=dao.getCourse(10).getList().get(1);

	}

}
