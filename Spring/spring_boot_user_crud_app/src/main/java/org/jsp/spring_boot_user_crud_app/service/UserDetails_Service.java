package org.jsp.spring_boot_user_crud_app.service;

import java.util.List;
import java.util.Optional;

import org.jsp.spring_boot_user_crud_app.dao.UserDetails_Dao;
import org.jsp.spring_boot_user_crud_app.dto.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetails_Service {
	
	@Autowired
	private UserDetails_Dao dao;
	
//	public void saveUser(UserDetails user) {
//		dao.saveUser(user);
//	}
	
	public UserDetails saveUserServices(UserDetails user) {
		return dao.saveUser(user);
	}
	
//	public UserDetails findByIdUserServices(int id) {
//		return dao.findByIdUser(id);
//	}
//	
	public Optional<UserDetails> findByIdUserServicesOptional(int id){
		return dao.findByIdUserOptional(id);
	}
	
	public UserDetails updateServices(UserDetails user) {
		return dao.updateUser(user);
	}
	
	public UserDetails validateServices(UserDetails user) {
		return dao.validateUser(user);
	}
	
	public void deleteServcies(int id) {
		dao.deleteUser(id);
	}
	
	public List<UserDetails> findAllServices(){
		return dao.findAllUser();
	}

}
