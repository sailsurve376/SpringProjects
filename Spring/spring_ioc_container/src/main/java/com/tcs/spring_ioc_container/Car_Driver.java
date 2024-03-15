package com.tcs.spring_ioc_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("car.xml");
		Car car=(Car) context.getBean("mycar");
		car.start("Audi");
		car.stop();

	}

}
