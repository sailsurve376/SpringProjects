package org.jsp.spring_ioc_annotation_no_xml_hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Student {
	@Id
	@Value("1")
	private String id;
	@Value("Sail")
	private String name;

}
