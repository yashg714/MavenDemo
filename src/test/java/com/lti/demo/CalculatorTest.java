package com.lti.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int res=new Calculator().add(10,20);
		assertEquals(30, res);
	}
	@Test
	public void test2() {
		int res=new Calculator().add(15,25);
		assertEquals(40, res);
	}

}
