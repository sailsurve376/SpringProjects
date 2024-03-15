package org.jsp.spring_boot_demo_app.controller;

import org.jsp.spring_boot_demo_app.dto.Demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Demo_Controller {
	@GetMapping("/hello")
	public void getMsg() {
		System.out.println("Hello this is get method");
	}
	@PostMapping("/hi")
	public String postMsg() {
		return "Hello this is post method";
	}
	
	@GetMapping("/object")
	public Demo postObject() {
		Demo demo=new Demo();
		demo.setId(1);
		demo.setName("Sail");
		return demo;
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Demo demo) {
		System.out.println(demo.getId());
		System.out.println(demo.getName());
		
	}
}
