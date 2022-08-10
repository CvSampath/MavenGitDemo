package com.lti.demos;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
	
	@Test
	void testExceptions() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				()->{Integer.parseInt("one");});
		
		
		
	}
	@Test
	public void testmethodExp() {
		Calculator c=new Calculator();
		final Exception e=assertThrows(ArithmeticException.class,
				()->{c.searchEmp(0);});
		Assertions.assertEquals("u entered zero", e.getMessage());
		
	}

}
