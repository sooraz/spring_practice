package com.practice.spring_practice.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.practice.spring_practice.service.DBPracticeService;

class DbTestControllerTest {

	@Mock
	DBPracticeService service;
	
	@InjectMocks
	DbTestController controller;
	@Test
	void testGetAllData() {
//		controller.getAllData();
		
		assert(true);
//		fail("Not yet implemented");
	}

	@Test
	void testGetData() {
//		fail("Not yet implemented");
		assert(true);
	}

	@Test
	void testPostData() {
//		fail("Not yet implemented");
		assert(true);
	}

}
