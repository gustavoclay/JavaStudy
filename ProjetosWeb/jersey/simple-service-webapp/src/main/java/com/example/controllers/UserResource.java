package com.example.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("users/{username}")
public class UserResource {

	@GET
	@Produces("text/plain")
	public String getUser(@PathParam("username") String userName) {
		return "Bem Vindo " + userName;
	} 
}
