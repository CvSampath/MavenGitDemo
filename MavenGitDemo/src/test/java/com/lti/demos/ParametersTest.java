package com.lti.demos;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class ParametersTest {
	@Test
	public void testLambdaList() {
		Integer intAry[]= {10,20,5,25};
		List<Integer> intList=Arrays.asList(intAry);
		Assertions.assertAll(
				()->Assertions.assertEquals(10,intList.get(0)),
				()->Assertions.assertEquals(20,intList.get(1)),
				()->Assertions.assertEquals(5,intList.get(2)),
				()->Assertions.assertEquals(25,intList.get(3))
				);
			
	}
	@ParameterizedTest
	@ValueSource(ints= {8,10,30,15,20})
	public void testIntAryParam(int arg) {
		System.out.println(" arg:"+arg);
		Assertions.assertTrue(arg%2==0);
	}
	
	@DisplayName("should passtest cases if all parma are not null")
	@ParameterizedTest
	@ValueSource(strings= {"hello","world"})
	public void testParams(String msg) {
		Assertions.assertNotNull(msg);
	}
	
	
	
	@RepeatedTest(value=3,name="repeat 3 times")
	public void repeatTest() {
		int a=10,b=20;
		Assertions.assertEquals(200, (a*b));
	}
	

}
