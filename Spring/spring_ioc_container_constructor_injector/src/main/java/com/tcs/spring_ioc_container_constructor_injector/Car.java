package com.tcs.spring_ioc_container_constructor_injector;

public class Car {
	private String brand;
	private double price;
	Engine engine;
	
	public Car(String brand,double price,Engine engine) {
		this.brand=brand;
		this.price=price;
		this.engine=engine;
	}
	
	public void carDetails() {
		System.out.println(brand+" "+price+" "+engine);
	}
}
