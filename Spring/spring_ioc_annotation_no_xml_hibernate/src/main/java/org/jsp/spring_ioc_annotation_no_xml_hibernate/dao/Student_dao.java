package org.jsp.spring_ioc_annotation_no_xml_hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.spring_ioc_annotation_no_xml_hibernate.dto.Student;
import org.springframework.stereotype.Component;
@Component
public class Student_dao {
	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistence");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	public void saveStudent(Student student) {
		transaction.begin();
		manager.persist(student);
		transaction.commit();
	}
}
