package com.tcs.spring_ioc_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bike_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("bike.xml");
		Bike bike=(Bike) context.getBean("mybike");
		bike.start();
		bike.stop();

	}

}
