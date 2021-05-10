package com.bookmymovie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bookmymovie.model.Login;

public interface LoginDao extends JpaRepository<Login,Integer>{
	
	@Query(value="from Login login where login.username=?1 and login.password=?2")
	public Login validate(String username, String password);

}
