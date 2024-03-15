package spring_ioc_annotation_container_animal;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component(value="cat")
public class Cat implements Animal {

	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Cat meows");
	}

}
