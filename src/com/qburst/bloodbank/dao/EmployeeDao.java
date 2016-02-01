package com.qburst.bloodbank.dao;

import com.qburst.bloodbank.model.Employee;

public interface EmployeeDao {
	
	Employee getEmployeeDetails(String employeeId);
}
