package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("helloworld")
public class HelloWorld {

	public static final String CLICHED_MESSAGE = "Hello World!";
	
	@GET
	@Produces("text/plain")
	public String gethelloWorld() {
		return CLICHED_MESSAGE;
	}
}
