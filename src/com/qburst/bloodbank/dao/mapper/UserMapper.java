/**
 * This class file is the property of QBurst technologies.
 * All rights reserved 2016
 */
package com.qburst.bloodbank.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.qburst.bloodbank.model.UserVO;

/**
 * @author Akhil Vennakkat(2736)
 *
 */
public class UserMapper implements RowMapper<UserVO> {

	@Override
	public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserVO userVO= new UserVO();
		userVO.setAddress(rs.getString(1));
		userVO.setBloodGroup(rs.getString(2));
		userVO.setEmail(rs.getString(3));
		userVO.setGender(rs.getString(4));
		userVO.setLocation(rs.getString(5));
		userVO.setMobileNo(rs.getString(6));
		userVO.setUserId(rs.getString(7));
		return userVO;
	}

}
