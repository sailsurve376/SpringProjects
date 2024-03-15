package com.tcs.spring_ioc_container_constructor_injector;

import java.util.Iterator;
import java.util.List;

public class Student {
	int id;
	String name;
	List<Skills> skills;
	public Student(int id,String name,List<Skills> skills) {
		this.id=id;
		this.name=name;
		this.skills=skills;
	}
	public void studentDetails() {
		System.out.println(id+" "+name);
		Iterator i=skills.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
