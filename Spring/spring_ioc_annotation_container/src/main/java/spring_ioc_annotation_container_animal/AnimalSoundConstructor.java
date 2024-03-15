package spring_ioc_annotation_container_animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class AnimalSoundConstructor {
	private Animal animal;
	@Autowired
	public void setAnimal(@Qualifier("lion")Animal animal) {
		this.animal = animal;
	}


//	@Autowired
//	public AnimalSoundConstructor(@Qualifier("lion") Animal animal) {
//	
//	this.animal = animal;
//}

	public void doSound() {
		animal.sound();
	}
}
