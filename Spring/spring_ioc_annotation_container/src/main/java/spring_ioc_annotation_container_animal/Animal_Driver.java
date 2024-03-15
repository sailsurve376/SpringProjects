package spring_ioc_annotation_container_animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Animal_Driver {
public static void main(String[] args) {
//	ApplicationContext context=new ClassPathXmlApplicationContext("springanimalconfiguration.xml");
//	AnimalSound animalsound=context.getBean(AnimalSound.class,"myanimalsound");
//	animalsound.doSound();
	
	ApplicationContext context1=new ClassPathXmlApplicationContext("springanimalconfiguration.xml");
	AnimalSoundConstructor animalsoundC=context1.getBean(AnimalSoundConstructor.class,"myanimalsoundC");
	animalsoundC.doSound();
	

}
}
