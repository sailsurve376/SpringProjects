package com.tcs.spring_ioc_container_constructor_injector;

public class Pen {
	private String brand;
	private String color;
	private double price;
	
	public Pen(String brand,String color,double price) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	
	public void penDetails() {
		System.out.println(brand+" "+color+" "+price);
	}
}
