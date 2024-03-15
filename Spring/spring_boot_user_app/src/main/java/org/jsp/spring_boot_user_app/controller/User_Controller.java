package org.jsp.spring_boot_user_app.controller;

import org.jsp.spring_boot_user_app.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User_Controller {
	
	@PostMapping("/saveuser")
	public void saveUser(@RequestBody User user)
	{
		System.out.println(user.getAge());
		System.out.println(user.getId());
		System.out.println(user.getName());
	}
	@GetMapping("/getuser")
	public User getUser(){
		User user=new User();
		user.setId(1);
		user.setAge(23);
		user.setName("Sail");
		return user;
	}


}
