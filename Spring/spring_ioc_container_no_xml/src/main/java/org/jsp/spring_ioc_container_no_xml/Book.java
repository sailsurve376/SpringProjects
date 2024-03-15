package org.jsp.spring_ioc_container_no_xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
	@Value("SSS")
	private String name;
	@Value("AAA")
	private String author;
	
	public void bookDetails() {
		System.out.println(name+" "+author);
	}

}
