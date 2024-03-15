package com.tcs.spring_getter_setter_injector;

public class Pencil {
	private String color;
	private String brand;
	private double price;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//object initialized
	public void objInit() {
		System.out.println("pencil obj intialized");
	}
	//object destroyed
	public void objDestroy() {
		System.out.println("pencil obj destroyed");
	}
}
