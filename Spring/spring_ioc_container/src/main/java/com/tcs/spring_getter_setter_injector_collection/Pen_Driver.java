package com.tcs.spring_getter_setter_injector_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pen_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("pen.xml");
		Pen pen=(Pen)context.getBean("mypen");
		System.out.println(pen.getBrand());
		System.out.println(pen.getColors());

	}

}
