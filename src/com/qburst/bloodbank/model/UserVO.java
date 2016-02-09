/**
 * This class file is the property of QBurst technologies.
 * All rights reserved 2016
 */
package com.qburst.bloodbank.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Akhil Vennakkat(2736)
 *
 */
@XmlRootElement(name = "UserVO")
public class UserVO {

	private String userName;
	private String userId;
	private String address;
	private String location;
	private String mobileNo;
	private String email;
	private String bloodGroup;
	private String weight;
	private Date dateOfBirth;
	private String gender;
	/**
	 * Getter method for the variable userName
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * Setter method for the variable userName 
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * Getter method for the variable userId
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * Setter method for the variable userId 
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * Getter method for the variable address
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * Setter method for the variable address 
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * Getter method for the variable location
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * Setter method for the variable location 
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * Getter method for the variable mobileNo
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	/**
	 * Setter method for the variable mobileNo 
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	/**
	 * Getter method for the variable email
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Setter method for the variable email 
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Getter method for the variable bloodGroup
	 * @return the bloodGroup
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}
	/**
	 * Setter method for the variable bloodGroup 
	 * @param bloodGroup the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	/**
	 * Getter method for the variable weight
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}
	/**
	 * Setter method for the variable weight 
	 * @param weight the weight to set
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}
	/**
	 * Getter method for the variable dateOfBirth
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * Setter method for the variable dateOfBirth 
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * Getter method for the variable gender
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * Setter method for the variable gender 
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

}
