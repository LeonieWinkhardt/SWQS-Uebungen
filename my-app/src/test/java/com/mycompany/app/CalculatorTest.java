package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	ICalculator calc;
	
	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
	}
	@After
	public void tearDown() throws Exception {
		calc = null;
	}
	@Test 
	public void testAddition () {
		assertEquals(9, calc.additionInteger(5, 4));
	}
	@Test 
	public void testSubtraktion () {
		assertEquals(1, calc.subtraktionInteger(5, 4));
	}
	@Test 
	public void testMultiplication () {
		assertEquals(20, calc.multiplikationInteger(5, 4));
	}
	@Test 
	public void testDivision () {
		assertEquals(4, calc.divisionInteger(20, 5));
	}
}
