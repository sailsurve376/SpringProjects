package org.jsp.spring_ioc_container_no_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(MyConfig.class);
		Book book=context.getBean(Book.class,"book");
		book.bookDetails();
		
		AnnotationConfigApplicationContext context1= new AnnotationConfigApplicationContext(MyConfig.class);
		Car car=context1.getBean(Car.class,"car");
		car.carDetails();
	}

}
