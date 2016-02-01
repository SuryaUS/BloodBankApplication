package com.qburst.bloodbank.servicesImpl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.qburst.bloodbank.daoImpl.EmployeeDaoImpl;
import com.qburst.bloodbank.services.SearchService;


public class SearchServiceImpl implements SearchService 
{
	@Autowired
	private EmployeeDaoImpl employeeDao; 

	@Override
	public Response getEmployeeDetail(String employeeId) 
	{
		if(employeeId == null)
		{
			return Response.status(Response.Status.BAD_REQUEST).build();
		}		
		return Response.ok(employeeDao.getEmployeeDetails(employeeId)).build();
	}
}
