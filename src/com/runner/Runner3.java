package com.runner;

import java.util.Scanner;

import com.accounts.Admin;
import com.datatypes.Address;

public class Runner3 {
	private static Address userAddress;
	private static Admin adminUser;
	private static String userPassword;

	public static void main(String[] args) {
		System.out.println("=============Welcome to the  MTB Application==============");
		System.out.println("What you want to do  today");
		System.out.println("1. Add Admin");
		System.out.println("2. Add Customer");
		System.out.println("3. FDO");

		// You want to take input from the user
		short userOption = 1;

		addPersonalInfo();
		setAddressInfo();
		getAccountInfo(adminUser);

	}

	private static void getAccountInfo(Admin user) {
		System.out.println(user.getEmailAddress());
		System.out.println(user.getName());
		System.out.println(user.getPhoneNumber());
	}

	private static void setAddressInfo() {
		// TODO Auto-generated method stub
		System.out.println("--------Enter Address Info-------");
		System.out.println("Enter admin street Address");
		String userStreetAddress = "MG Road";

		System.out.println("Enter city");
		String userCity = "Bangalore";

		System.out.println("Enter state");
		String userState = "Karnataka";

		System.out.println("Enter country");
		String userCountry = "India";

		System.out.println("Enter Pincode");
		String userPincode = "400104";

		Address address = new Address();
		address.setStreetAddress(userStreetAddress);
		address.setCity(userCity);
		address.setState(userState);
		address.setCountry(userCountry);
		address.setZipcode(userPincode);
		adminUser.setAddress(userAddress);
		adminUser.createAccount(userPassword);
	}

	private static void addPersonalInfo() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Admin Name.....");
		String userName = "Dhanush";

		System.out.println("Enter the Admin Phone Number.....");
		String userPhonenumber = "987582083";

		System.out.println("Enter the Admin email id.....");
		String userEmailAddress = "Dhanush@yahoo.com";

		System.out.println("Set a password");
		String userPassword = "1234";

		Admin admin = new Admin();
		admin.setName(userName);
		admin.setEmailAddress(userEmailAddress);
		admin.setPhoneNumber(userPhonenumber);

//		System.out.println("Account created successfully");
	}
}