package org.jsp.animal;

public class AnimalSound {
	
	Animal animal;
	
	public void doSound() {
		animal.sound();
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
