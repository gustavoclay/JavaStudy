package com.jersey.rest.backend;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class MyApplication extends ResourceConfig{

	public MyApplication () {
		packages("com.jersey.rest.backend.controllers");
	}
	
}
