package spring_ioc_annotation_container;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
@Value("1")
private int id;
@Value("Sail")
private String name;

public void studentDetails() {
	System.out.println(id+" "+name);
	
}

}
