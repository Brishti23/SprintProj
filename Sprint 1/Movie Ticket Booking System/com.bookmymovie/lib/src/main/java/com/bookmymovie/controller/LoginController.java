package com.bookmymovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmymovie.model.Login;
import com.bookmymovie.service.LoginService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	LoginService service;
	
	@PostMapping("/validate")
	public ResponseEntity<Login> validate(@RequestBody Login login){
		Login log=service.validate(login.getUsername(),login.getPassword());
		return new ResponseEntity<>(log,HttpStatus.OK);
		
	}
	@PostMapping("/add")
	public ResponseEntity<String> addUser(@RequestBody Login login){
		service.addUser(login);
		return new ResponseEntity<String>("User added",HttpStatus.OK);
	}
}