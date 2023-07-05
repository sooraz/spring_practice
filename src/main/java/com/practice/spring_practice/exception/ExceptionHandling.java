package com.practice.spring_practice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandling{

	@ExceptionHandler(ValidationPosException.class)
	@ResponseBody
	ResponseEntity<Object> handlePos(ValidationPosException e){
		return new ResponseEntity<>("error"+e.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
}
