package com.gx.hyd.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myJerseyService")
public class BikeService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getDetails() {
		return "Hello Mahender !!";
	}

}
