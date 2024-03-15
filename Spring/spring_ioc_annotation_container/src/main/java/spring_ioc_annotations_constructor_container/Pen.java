package spring_ioc_annotations_constructor_container;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen {
	private String brand;
	private double price;
	public Pen(@Value("Reynolds")String brand, @Value("20.00")double price) {
		
		this.brand = brand;
		this.price = price;
	}
	public void penDetails() {
		System.out.println(brand+" "+price);
	}
	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", price=" + price + "]";
	}
	
}
