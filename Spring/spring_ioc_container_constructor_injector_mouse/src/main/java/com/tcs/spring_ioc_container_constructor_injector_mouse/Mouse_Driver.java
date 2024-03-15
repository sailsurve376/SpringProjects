package com.tcs.spring_ioc_container_constructor_injector_mouse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mouse_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mouse.xml");
		Mouse mouse=(Mouse)applicationContext.getBean("mymouse");
		mouse.mouseDetails();
		
	}

}
