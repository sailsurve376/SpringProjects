package spring_ioc_annotations_setter_container;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car1 {
	private String brand;
	private double price;
	private String type;
	public String getBrand() {
		return brand;
	}
	@Value("BMW")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	@Value("30000000")
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	@Value("Petrol")
	public void setType(String type) {
		this.type = type;
	}
	
	public void carDetails() {
		System.out.println(brand+" "+price+" "+type);
	}
	@PostConstruct
	public void hey() {
		System.out.println("Heyyy");
	}
	@PreDestroy
	public void byee() {
		System.out.println("Byee");
	}

}
