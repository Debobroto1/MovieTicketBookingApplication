package com.accounts;

import com.datatypes.AccountStatus;
import com.datatypes.Address;

public class Person {

	protected String name;
	protected String emailAddress;
	protected Address address;
	protected String phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void createAccount(String password) {
		Account account = new Account();
		account.setId("123");
		account.setPassword(password);
		account.setStatus(AccountStatus.Active);
		System.out.println("Account created!!!");
	}
}
