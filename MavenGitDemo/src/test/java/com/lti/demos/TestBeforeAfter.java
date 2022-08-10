package com.lti.demos;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestBeforeAfter {
	
Calculator c=new Calculator();
int sum=0;
	
	@BeforeAll //onli once all the test cases
	public static void testStarDbConn(){
		System.out.println("db connection is up");
		
	}

	@BeforeEach //before each test case
	public void testStartup(){
		sum=0;
		System.out.println("sum is"+sum);
		
		
	}
	@Test
	public void testSayhello() {
		System.out.println("test case 1");
		String msg=c.sayHello();
		Assertions.assertEquals("hello world",msg);
	}
	
	@Test//message is optional //if test case failed - msg displayed
	public void testaddno() {
		System.out.println("test case 2");
		int result=c.addNos(1000, 2000);
		Assertions.assertEquals(3000,result,"plz check addition method");
	}
	@AfterEach
	public void testShutdown() {
		System.out.println("some object null");
		
	}
	
	@AfterAll
	public static void testShutConn() {
		System.out.println("connection shut down");
	}

}
