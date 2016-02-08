package com.webservices.rest;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class RestService {
	
	@GET
	@Path("helloworld")
	@Produces({ MediaType.APPLICATION_JSON })
	public Greeting helloworld() {
	    return new Greeting();
	}
	
	@POST
	@Path("hello")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_JSON })
	public Greeting hello(@QueryParam("name") String name) {
	    return new Greeting(name);
	}
	
	@GET
	@Path("/hellokitty")
	@Produces("image/jpeg")
	public BufferedImage hellokitty() throws IOException {
		BufferedImage imgB = null;		
		return imgB = ImageIO.read(getClass().getResourceAsStream("hellokitty.jpg"));		
		}
}