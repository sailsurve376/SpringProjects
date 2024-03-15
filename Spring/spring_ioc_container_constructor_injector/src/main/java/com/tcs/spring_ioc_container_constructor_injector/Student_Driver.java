package com.tcs.spring_ioc_container_constructor_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("student.xml");
		Student student=(Student)applicationContext.getBean("mystudent");
		student.studentDetails();

	}

}
