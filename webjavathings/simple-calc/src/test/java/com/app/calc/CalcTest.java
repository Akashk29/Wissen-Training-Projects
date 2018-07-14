package com.app.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {

	Calculator calculator ;
	
	@Before
	public void setUp()
	{
		calculator = new Calculator();
		
	}
	
	@Test
	public void testAdd() {
		
	int actual = calculator.add(12, 12);
	int expected = 24;
	assertEquals(expected, actual);
		
	}
	
	@Test
	public void testSub() {
		
	int actual = calculator.sub(12, 12);
	int expected = 0;
	assertEquals(expected, actual);
		
	}
	
	
}
