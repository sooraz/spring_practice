package com.practice.spring_practice.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring_practice.exception.ValidationPosException;

import lombok.extern.java.Log;

//import lombok.extern.log4j.Log4j2;


@RestController
@RequestMapping(value = "/")
//@Log4j2
public class DefaultController {

//	Logger logger = LogManager.getLogger(DefaultController.class);
	Logger log = LogManager.getLogger(DefaultController.class);
	@GetMapping
	ResponseEntity<Object> defaultFirst() {
        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        data.put("key2", "cheppanusir");
//        logger.debug("ayyind1");
//        logger.debug("ayyind2");
//        logger.info("baga ayyindi");
        log.info("sooraz");
        return new ResponseEntity<>(data, HttpStatus.OK);
	}
//	@GetMapping(value = "/soor2")
//	User defaultFirstsoor() {
//		log.info("sooraz2");
//        return new User();
//	}
//	
//	@PostMapping
//	User defaultPost(@RequestBody User user) throws ValidationPosException {
//		if(user.getRollNo().isBlank())
//			throw new ValidationPosException("roolno is balnck please add");
//		return user;
//	}
	
	
	@GetMapping(value = "/soor")
	ResponseEntity<Object> defaultsecond() {
        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
}
