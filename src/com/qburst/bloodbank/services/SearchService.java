package com.qburst.bloodbank.services;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 
 * @author surya
 * This is interface for the employee services
 *
 */
@Path("/")
@WebService(name="employeeService")
public interface SearchService 
{
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/getemployeedetail")
	public Response getEmployeeDetail(@QueryParam("employeeId") String employeeId);
	
}
