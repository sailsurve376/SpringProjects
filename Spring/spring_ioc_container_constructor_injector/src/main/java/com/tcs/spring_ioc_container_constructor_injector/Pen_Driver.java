package com.tcs.spring_ioc_container_constructor_injector;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Pen_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//J2EE CONTAINER
		//ApplicationContext context=new ClassPathXmlApplicationContext("pen.xml");
		
		//CORE CONTAINER
		Resource resource=new ClassPathResource("pen.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Pen pen=(Pen)factory.getBean("mypen");
		pen.penDetails();
	}

}
