package spring_ioc_annotations_constructor_container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student1 {
	private String name;
	private int age;
	private long mob;
	private Pen pen;
	private Mobile mobile;
	@Autowired
	public Student1(@Value("Sail")String name,@Value("23") int age, @Value("35666456")long mob, Pen pen,Mobile mobile) {
		
		this.name = name;
		this.age = age;
		this.mob = mob;
		this.pen = pen;
		this.mobile = mobile;
	}
	
	public void student1Details() {
		System.out.println(name+" "+age+" "+mob+" "+pen+" "+mobile);
		pen.penDetails();

	}
}
