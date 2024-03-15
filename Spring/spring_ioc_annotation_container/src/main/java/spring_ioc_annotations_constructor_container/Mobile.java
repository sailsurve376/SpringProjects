package spring_ioc_annotations_constructor_container;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	private String brand;
	private double price;
	private String model;
	public Mobile(@Value("ASUS")String brand,@Value("10000") double price, @Value("M1 Pro")String model) {
		
		this.brand = brand;
		this.price = price;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", model=" + model + "]";
	}
	
}
