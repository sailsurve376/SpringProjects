package org.jsp.spring_ioc_container_no_xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

private String brand;
private String price;
public Car(@Value("BMW")String brand,@Value("5000000") String price) {

	this.brand = brand;
	this.price = price;
}
public void carDetails() {
	System.out.println(brand);
	System.out.println(price);
}

}
