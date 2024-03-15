package spring_ioc_annotation_container_animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class AnimalSound {
	@Autowired
	@Qualifier("cat")
	private Animal animal;
	
	public void doSound() {
		animal.sound();
	}
}
