package com.accounts;

import com.datatypes.AccountStatus;

public class Account {
	private String id;
	private String password;
	private AccountStatus status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AccountStatus getStatus() {
		return status;
	}
	public void setStatus(AccountStatus status) {
		this.status = status;
	}
	
	public boolean resetPassword() {
		//Code reset password
		password="1234";
		System.out.println("Your password is reset successfully");
		return false;
		
	}
}
