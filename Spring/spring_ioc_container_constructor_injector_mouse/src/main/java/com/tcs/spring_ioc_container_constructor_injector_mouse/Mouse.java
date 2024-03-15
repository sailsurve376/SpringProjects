package com.tcs.spring_ioc_container_constructor_injector_mouse;

public class Mouse {
	String brand;
	double price;
	public Mouse(String brand,double price) {
		this.brand=brand;
		this.price=price;
	}
	public void mouseDetails() {
		System.out.println(brand+" "+price);
	}
}
