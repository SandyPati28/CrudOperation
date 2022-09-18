package com.example.demo.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class); //pass your class name
	
	
	@GetMapping("/city/{city}")
	public ResponseEntity<List<User>>getListByCity(@PathVariable("city")String city){
		// writes >>
		logger.info ("In login service method");
		
		List<User> list=userService.getListByCity(city);
		
		return ResponseEntity.ok().body(list);
		
		
	}
	
	

}
