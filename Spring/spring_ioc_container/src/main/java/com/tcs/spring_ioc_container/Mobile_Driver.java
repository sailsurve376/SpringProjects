package com.tcs.spring_ioc_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile_Driver {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("mobile.xml");
	Mobile mobile=(Mobile) context.getBean("mymobile");
	mobile.calling();
	mobile.msg();
}
}
