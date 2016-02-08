package com.webservices.rest;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {
	
	@Test
	public void emptyGreeting() {
		Greeting greeting = new Greeting();
		assertEquals("Hello World !", greeting.getMessage());		
	}
	@Test
	public void greeting() {
		Greeting greeting = new Greeting("Tom");
		assertEquals("Hello Tom", greeting.getMessage());		
	}
}
