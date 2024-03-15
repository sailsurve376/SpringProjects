package spring_ioc_annotations_constructor_container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Students {
	@Value("Sail")
	private String name;
	@Value("23")
	private int age;
	@Value("53627557")
	private long mob;
	@Autowired
	private Pen pen;
	@Autowired
	private Mobile mobile;
	
	public void studentsDetails() {
		System.out.println("=============");
		System.out.println(name+" "+age+" "+mob+" "+pen+" "+mobile);
		pen.penDetails();
	}
}
