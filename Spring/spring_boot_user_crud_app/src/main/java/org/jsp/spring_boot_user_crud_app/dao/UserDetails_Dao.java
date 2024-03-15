package org.jsp.spring_boot_user_crud_app.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.spring_boot_user_crud_app.dto.UserDetails;
import org.jsp.spring_boot_user_crud_app.repository.UserDetails_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserDetails_Dao {
	@Autowired
	private UserDetails_Repository repository;
	
//	public void saveUser(UserDetails user)
//	{
//		repository.save(user);
//	}
	
	public UserDetails saveUser(UserDetails user)
	{
		return repository.save(user);
	}
//	
//	public UserDetails findByIdUser(int id) {
//		return repository.findById(id);
//	}
//	
	public Optional<UserDetails> findByIdUserOptional(int id){
		return repository.findById(id);
	}
	
	public UserDetails updateUser(UserDetails user) {
		return repository.save(user);
	}
	
	public UserDetails validateUser(UserDetails user) {
		return repository.validate(user.getEmail(), user.getName());
	}
	
	public void deleteUser(int id) {
		 repository.deleteById(id);
	}
	public List<UserDetails> findAllUser(){
		return repository.findAll();
	}
}
