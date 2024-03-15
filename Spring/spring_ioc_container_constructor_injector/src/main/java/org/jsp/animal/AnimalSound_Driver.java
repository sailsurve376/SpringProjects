package org.jsp.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalSound_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("animal.xml");
		AnimalSound animalsound=(AnimalSound)applicationContext.getBean("myanimalsound");
		animalsound.doSound();


	}

}
