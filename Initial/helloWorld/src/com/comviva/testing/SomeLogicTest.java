package com.comviva.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SomeLogicTest {
	SomeLogic logic;
	
	@Before
	public void setUp(){
		logic = new SomeLogic();
	}
	
	@Test
	public void hitest() {
		assertTrue("Testing for true to sayHi ", logic.sayHi());
	}
	
	@Test
	public void hiStringTest(){
		String name = "Harry";
		assertEquals("Hi " + name, logic.sayHi(name));
	}
	
	@Test
	public void hiStringThreadTest(){
		String name2 = "Harry";
		assertEquals("Hello " + name2, logic.sayHello(name2));
	}
}
