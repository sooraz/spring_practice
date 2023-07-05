package com.practice.spring_practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring_practice.entity.DBPracticeEntity;
import com.practice.spring_practice.service.DBPracticeService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/db")
@Log4j2
public class DbTestController {

	@Autowired
	DBPracticeService service;
	
//	Logger logger = LogManager.getLogger(DbTestController.class);
	
	@GetMapping
	List<DBPracticeEntity> getAllData(){
		return service.getData(); 
	}
	
	@GetMapping(value = "/{id}")
	DBPracticeEntity getData(@PathVariable int id) {
		return service.getDataForId(id);
	}
	@PostMapping
	int postData(@RequestBody DBPracticeEntity data) {
		log.info("in is"+data);
//		logger.info("in is"+data);
		return service.setData(data);
	}
	
}
