package spring_ioc_annotation_container;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	@Value("Royal Enfield")
	private String brand;
	@Value("150")
	private int cc;
	@Value("5000.00")
	private double price;
	
	public void bikeDetails() {
		System.out.println(brand+" "+cc+" "+price);
	}

}
