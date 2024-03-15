package com.tcs.spring_ioc_container_constructor_injector;

public class Skills {
	int id;
	String name;
	@Override
	public String toString() {
		return "Skills [id=" + id + ", name=" + name + "]";
	}
	public Skills(int id,String name) {
		this.id=id;
		this.name=name;
	}
}
