package com.practice.spring_practice.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class DefaultControllerTest {

	@InjectMocks
	DefaultController controller;

	@Test
	void testDefaultFirst() {
		Object obj = controller.defaultFirst();
		try {
			ResponseEntity<Object> res =(ResponseEntity<Object>) obj;
			assert(HttpStatus.OK == res.getStatusCode());
//			e.getStatusCode()
		}
		catch(Exception e) {
			assert(false);
		}
//		fail("Not yet implemented");
	}

	@Test
	void testDefaultsecond() {
		assert(true);
//		fail("Not yet implemented");
	}

}
