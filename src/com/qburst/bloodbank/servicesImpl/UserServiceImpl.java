/**
 * This class file is the property of QBurst technologies.
 * All rights reserved 2016
 */
package com.qburst.bloodbank.servicesImpl;

import javax.ws.rs.core.Response;

import com.qburst.bloodbank.model.UserVO;
import com.qburst.bloodbank.services.UserService;

/**
 * @author Akhil Vennakkat(2736)
 *
 */
public class UserServiceImpl implements UserService{

	/* (non-Javadoc)
	 * @see com.qburst.bloodbank.services.UserService#registerUser(com.qburst.bloodbank.model.UserVO)
	 */
	@Override
	public Response registerUser(UserVO uservo ) {
		// TODO Auto-generated method stub
		System.out.println(uservo);
		return null;
	}

}
