package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTests {
	
	Calculator c=new Calculator();
	
	@Disabled
	@Test
	public void testSayhello() {
		String msg=c.sayHello();
		Assertions.assertEquals("hello world",msg);
	}
	@Disabled
	@Test//message is optional //if test case failed - msg displayed
	public void testaddno() {
		int result=c.addNos(1000, 2000);
		Assertions.assertEquals(1000,result,"plz check addition method");
	}
	@Disabled
	@Test
	public void testsubno() {
		int result=c.subNos(2000, 1000);
		Assertions.assertEquals(1000,result);
	}
	
	@Disabled
	@Test
	public void testAssertNulls() {
		String s1=null;
		String s2="nikhil";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	
	@Disabled
	@Test
	public void testAssertFalse() {
		
		Assertions.assertFalse("sunit".length()==10);
		Assertions.assertFalse(10>20,"10 is smaller");
		Assertions.assertNotEquals("hello","Hello");
	}
	
	
	@Test
	public void testArrays() {
		ArrayList<Integer> myList=new ArrayList<>();
		Assertions.assertEquals(0, myList.size());
		Assertions.assertTrue(myList.isEmpty());
		myList.add(100);
		myList.add(200);
		//Assertions.assertEquals(2, myList.size());
	}
	
	
	
	

}
