package com.bookmymovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmymovie.dao.LoginDao;
import com.bookmymovie.model.Login;

@Service
public class LoginService   {
	
@Autowired
LoginDao dao;
public Login validate(String username,String password) {
	Login login=dao.validate(username, password);
	return login;
}
public void addUser(Login login) {
	dao.save(login);
}

}
