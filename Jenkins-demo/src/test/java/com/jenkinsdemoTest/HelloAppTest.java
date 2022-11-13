package com.jenkinsdemoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class HelloAppTest {
	
	@BeforeAll
	  static void beforeAll() {
	    System.out.println("Before all Test Cases");
	  }
	
	@BeforeEach
	  void beforeEach() {
	    System.out.println("Before each test method");
	  }
   
//	@Test
//	void testHello() {
//		assertEquals(true, true);
//	}
	
	@Test
	void testHello1() {
		assertEquals("Hello Pavan", "Hello Pavan");
	}
	
	 @AfterEach
	  void afterEach() {
	    System.out.println("After each test method");
	  }
   
	 @AfterAll
	  static void afterAll() {
	    System.out.println("After all test cases");
	  }
	
}
