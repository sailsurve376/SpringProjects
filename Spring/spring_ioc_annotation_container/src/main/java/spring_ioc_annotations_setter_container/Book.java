package spring_ioc_annotations_setter_container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
	private String name;
	private String author;
	private Writer writer;
	private Publisher publisher;
	public Writer getWriter() {
		return writer;
	}
	@Autowired
	public void setWriter(Writer writer) {
		this.writer = writer;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	@Autowired
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public String getName() {
		return name;
	}
	@Value("SSS")
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	@Value("AAA")
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void bookDetails() {
		System.out.println(name+" "+author+" "+writer+" "+publisher);
	}
	
	
}
