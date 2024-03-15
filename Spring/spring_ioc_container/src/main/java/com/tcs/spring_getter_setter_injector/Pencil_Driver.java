package com.tcs.spring_getter_setter_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pencil_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("pencil.xml");
//		Pencil pencil=(Pencil)applicationContext.getBean("mypencil");
//		System.out.println(pencil.getColor());
//		System.out.println(pencil.getBrand());
//		System.out.println(pencil.getPrice());
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("pencil.xml");
		Pencil pencil=(Pencil)context.getBean("mypencil");
		System.out.println(pencil.getColor());
		System.out.println(pencil.getBrand());
		System.out.println(pencil.getPrice());
		context.close();
		
	}

}
