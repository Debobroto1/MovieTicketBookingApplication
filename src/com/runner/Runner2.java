package com.runner;

import java.util.Scanner;

import com.accounts.Admin;
import com.datatypes.Address;

public class Runner2 {

	public static void main(String[] args) {
		System.out.println("=============Welcome to the  MTB Application==============");
		System.out.println("What you want to do  today");
		System.out.println("1. Add Admin");
		System.out.println("2. Add Customer");
		System.out.println("3. FDO");

		// You want to take input from the user
		short userOption = 1;

		System.out.println("Enter the Admin Name.....");
		String userName = "Dhanush";

		System.out.println("Enter the Admin Phone Number.....");
		String userPhonenumber = "987582083";

		System.out.println("Enter the Admin email id.....");
		String userEmailAddress = "Dhanush@yahoo.com";

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

		System.out.println("Set a password");
		String userPassword = "1234";
		Address userAddress = new Address();
		userAddress.setStreetAddress(userStreetAddress);
		userAddress.setCity(userCity);
		userAddress.setState(userState);
		userAddress.setCountry(userCountry);
		userAddress.setZipcode(userPincode);

		Admin adminUser = new Admin();
		adminUser.setName(userName);
		adminUser.setEmailAddress(userEmailAddress);
		adminUser.setPhoneNumber(userPhonenumber);
		adminUser.setAddress(userAddress);
		adminUser.createAccount(userPassword);
		System.out.println("Account created successfully");

	}
}