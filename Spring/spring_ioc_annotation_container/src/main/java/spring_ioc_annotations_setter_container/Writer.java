package spring_ioc_annotations_setter_container;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Writer {
	@Value("FGF")
	private String name;

	@Override
	public String toString() {
		return "Writer [name=" + name + "]";
	}

}
