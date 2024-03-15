package spring_ioc_annotations_setter_container;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Publisher {
	@Override
	public String toString() {
		return "Publisher [name=" + name + "]";
	}

	@Value("HHH")
	private String name;
}
