package org.jsp.spring_ioc_annotation_no_xml_hibernate.controller;

import org.jsp.spring_ioc_annotation_no_xml_hibernate.dao.Student_dao;
import org.jsp.spring_ioc_annotation_no_xml_hibernate.dto.MyConfig;
import org.jsp.spring_ioc_annotation_no_xml_hibernate.dto.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Student_controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Student student=context.getBean(Student.class,"student");
		Student_dao dao=context.getBean(Student_dao.class,"studentDao");
		dao.saveStudent(student);

	}

}
