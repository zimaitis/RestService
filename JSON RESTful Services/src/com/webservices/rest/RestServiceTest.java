package com.webservices.rest;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class RestServiceTest {

	@Test
	public void restService() throws IOException {		
		RestService restService = new RestService();
		assertNotNull(restService.helloworld());
		assertNotNull(restService.hello("Tom"));
		assertNotNull(restService.hellokitty());
	}
}
