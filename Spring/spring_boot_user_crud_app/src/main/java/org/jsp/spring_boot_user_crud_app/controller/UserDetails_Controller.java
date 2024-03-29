package org.jsp.spring_boot_user_crud_app.controller;

import java.util.List;
import java.util.Optional;

import org.jsp.spring_boot_user_crud_app.dto.UserDetails;
import org.jsp.spring_boot_user_crud_app.service.UserDetails_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetails_Controller {
	@Autowired
	private UserDetails_Service service;
	
//	@PostMapping("/save/user")
//	public void saveUser(@RequestBody UserDetails user) {
//		service.saveUser(user);
//	}
	
	@PostMapping("/save/return/user")
	public UserDetails saveUserController(@RequestBody UserDetails user) {
		return service.saveUserServices(user);
	}
	
//	@GetMapping("/find/return/user/id") //using param
//	public UserDetails findByIdUserController(@RequestParam int id)
//	{
//		return service.findByIdUserServices(id);
//	}
	
	@GetMapping("/find/return/user/{id}") //using url path
	public Optional<UserDetails> findByIdPathUserControllerOptional(@PathVariable int id) {
	
			return service.findByIdUserServicesOptional(id);
		}
	
	
	@PutMapping("/update/user")
	public UserDetails updateController(@RequestBody UserDetails user) {
		
		return service.updateServices(user);
	}
	
	@GetMapping("/validate")
	public UserDetails validateController(@RequestBody UserDetails user) {
		return service.validateServices(user);
	}
	@DeleteMapping("/delete/user/{id}")
	public void deleteController(@PathVariable int id) {
		service.deleteServcies(id);
	}
	@GetMapping("/findAll/user")
	public List<UserDetails> findAllController(){
		return service.findAllServices();
	}
	
}
	
	

