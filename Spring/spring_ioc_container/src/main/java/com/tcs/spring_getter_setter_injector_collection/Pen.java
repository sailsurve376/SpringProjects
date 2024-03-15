package com.tcs.spring_getter_setter_injector_collection;

import java.util.List;

public class Pen {
	private String brand;
	List<ColorType> colors;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public List<ColorType> getColors() {
		return colors;
	}
	public void setColors(List<ColorType> colors) {
		this.colors = colors;
	}

	
}
