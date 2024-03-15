package spring_ioc_annotation_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_ioc_annotations_constructor_container.Pen;
import spring_ioc_annotations_constructor_container.Student1;
import spring_ioc_annotations_constructor_container.Students;
import spring_ioc_annotations_setter_container.Book;
import spring_ioc_annotations_setter_container.Car1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("springconfiguration.xml");
		Bike bike=(Bike)applicationContext.getBean("bike");
		bike.bikeDetails();
		
		Car car=(Car)applicationContext.getBean("car");
		car.carDetails();
		
		Student student=(Student)applicationContext.getBean("student");
		student.studentDetails();
		
		//no need to downcast as getbean is returning pen object bcoz we have mentioned classname
		//we can manually write bean id name using this eg. mypen
		Pen pen=applicationContext.getBean(Pen.class,"mypen");
		pen.penDetails();
		
		//autowired in Students class
		
		Students students=applicationContext.getBean(Students.class,"mystudent");
		students.studentsDetails();
		
		Student1 student1=applicationContext.getBean(Student1.class,"mystudent1");
		student1.student1Details();
		
		//getter setter injector
		
		Car1 car1=applicationContext.getBean(Car1.class,"mycar");
		car1.carDetails();
		
		//init destroy
		
		ClassPathXmlApplicationContext applicationContext2=new ClassPathXmlApplicationContext("springconfiguration.xml");
		Car1 car2=applicationContext2.getBean(Car1.class,"mycar1");
		car2.carDetails();
		applicationContext2.close();
		

		Book book=applicationContext.getBean(Book.class,"mybook");
		book.bookDetails();
	}

}
