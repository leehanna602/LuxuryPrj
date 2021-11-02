package com.mycompany.myapp.vo;

import java.sql.Date;

public class UserVO {
	private int userNo;
	private String userId;
	private String userPassword;
	private String userName;
	private Date userBirth;
	private String userAddress;
	private String userPhone;
	private Date userSignup;
	private int userIsAdmin;
	
	public UserVO() {
		super();
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(Date userBirth) {
		this.userBirth = userBirth;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Date getUserSignup() {
		return userSignup;
	}

	public void setUserSignup(Date userSignup) {
		this.userSignup = userSignup;
	}

	public int getUserIsAdmin() {
		return userIsAdmin;
	}

	public void setUserIsAdmin(int userIsAdmin) {
		this.userIsAdmin = userIsAdmin;
	}

	@Override
	public String toString() {
		return "UserVO [userNo=" + userNo + ", userId=" + userId + ", userPassword=" + userPassword + ", userName="
				+ userName + ", userBirth=" + userBirth + ", userAddress=" + userAddress + ", userPhone=" + userPhone
				+ ", userSignup=" + userSignup + ", userIsAdmin=" + userIsAdmin + "]";
	}
	
	
}
