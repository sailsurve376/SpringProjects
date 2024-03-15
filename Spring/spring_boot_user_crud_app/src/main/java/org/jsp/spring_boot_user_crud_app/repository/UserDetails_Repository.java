package org.jsp.spring_boot_user_crud_app.repository;

import java.util.List;
import java.util.Optional;

import org.jsp.spring_boot_user_crud_app.dto.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDetails_Repository extends JpaRepository<UserDetails, Integer>{
	UserDetails save(UserDetails user);
	
	Optional<UserDetails> findById(int id);
	@Query("select u from UserDetails u where u.email=:email and u.name=:name")
	UserDetails validate(@Param("email") String email,@Param("name")String name);
	
	List<UserDetails> findAll();
	
	

}
