package com.neo.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@ApplicationPath("/light")
@Path("/light")
@Api(value = "/light", description = "Test")
public class LightService {

	@GET
	@Path("/on/{id}")
	@ApiOperation(value = "on", position = 4)
    @ApiResponses(value = {@ApiResponse(code = 404, message = "not found")})
	public String switchOn(@PathParam("id")  long id){
		return runScript("test");
	}

	protected String runScript(String target){
		return "OK : " + target;
	}
}
