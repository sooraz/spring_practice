package com.practice.spring_practice.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring_practice.entity.User;

@RestController
@RequestMapping(value = "/param")
public class paramGetController {
	
	@GetMapping
	private ResponseEntity<Object> name(@RequestParam(required = false) String value) {
	return new ResponseEntity<>("hello "+value,HttpStatus.OK);
	}
	@GetMapping(path = "/form")
	private ResponseEntity<User> form(@RequestParam(required = false) User user) {
//		return new ResponseEntity<>("hello "+value,HttpStatus.OK);
		System.out.println(user);
		return new ResponseEntity<>(user,HttpStatus.OK);
//		return user;
		}
	@GetMapping(path = "/form2")
	private ResponseEntity<Object> form2(@RequestParam String name,@RequestParam String rollno) {
//		return new ResponseEntity<>("hello "+value,HttpStatus.OK);
//		System.out.println(user);
		return new ResponseEntity<>("name ::"+name+" "+rollno,HttpStatus.OK);
//		return user;
		}
	@GetMapping(path = "/form3")
	private ResponseEntity<Object> form3(@RequestParam Map<String,String> params){
		return new ResponseEntity<>( params,HttpStatus.OK);
	}
}
