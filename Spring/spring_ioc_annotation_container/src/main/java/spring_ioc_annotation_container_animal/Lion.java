package spring_ioc_annotation_container_animal;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component(value="lion")
//@Primary
public class Lion implements Animal{

	public void sound() {
		System.out.println("Lion Roars");
		
	}

}
