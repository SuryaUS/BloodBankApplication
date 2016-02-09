package com.qburst.bloodbank.daoImpl;


import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.qburst.bloodbank.dao.EmployeeDao;
import com.qburst.bloodbank.dao.mapper.UserMapper;
import com.qburst.bloodbank.model.Employee;
import com.qburst.bloodbank.model.UserVO;

public class EmployeeDaoImpl implements EmployeeDao{

	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
   
	public Employee getEmployeeDetails(String employeeId)
	{
		List<UserVO> users= jdbcTemplate.query("SELECT * FROM qb_user_details", new UserMapper());
		UserVO userVO=users.get(0);
		Employee emp = new Employee();
		emp.setDepartment(userVO.getAddress());
		emp.setEmail(userVO.getUserId());
		emp.setEmployeeId(userVO.getBloodGroup());
		emp.setFirstName(userVO.getLocation());
		emp.setLastName(userVO.getMobileNo());
		return emp;
	}

	/**
	 * Getter method for the variable dataSource
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * Setter method for the variable dataSource 
	 * @param dataSource the dataSource to set
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
}
