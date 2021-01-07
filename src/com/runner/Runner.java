package com.runner;

import java.util.Scanner;

import com.accounts.Admin;
import com.datatypes.Address;

public class Runner {
	private static Address[] userAddress;
	private static Admin[] adminUser;
	private static String userPassword;
	private static Scanner sc;

	public static void main(String[] args) {
		userAddress =new Address[10];
		adminUser=new Admin[10];
		
		sc=new Scanner(System.in);
		System.out.println("=============Welcome to the  MTB Application==============");
		System.out.println("What you want to do  today");
		System.out.println("1. Add Admin");
		System.out.println("2. Add Customer");
		System.out.println("3. FDO");
		System.out.println("Enter a choice [1 to 3]");

		// You want to take input from the user
		short userOption = sc.nextShort();
		if (userOption == 1) {
		System.out.println("You have eneter the option " +userOption);
		addPersonalInfo();
		setAddressInfo();
		getAccountInfo(adminUser);
		}
		else if  (userOption == 2) {
			System.out.println("Enter Customer");
		}
		else if  (userOption == 3) {
			System.out.println("Enter FDO");
		}
		else
			System.out.println("Invalid Input ,retry again!!!!!!!!");
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
		String userStreetAddress = sc.nextLine();

		System.out.println("Enter city");
		String userCity = sc.nextLine();

		System.out.println("Enter state");
		String userState = sc.nextLine();

		System.out.println("Enter country");
		String userCountry = sc.nextLine();

		System.out.println("Enter Pincode");
		String userPincode = sc.nextLine();

		Address address = new Address();
		address.setStreetAddress(userStreetAddress);
		address.setCity(userCity);
		address.setCountry(userCountry);
		address.setState(userState);
		address.setZipcode(userPincode);
		adminUser.setAddress(address);
		adminUser.createAccount(userPassword);
	}
	private static void addPersonalInfo() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Admin Name.....");
		String userName = sc.nextLine();

		System.out.println("Enter the Admin Phone Number.....");
		String userPhonenumber = sc.nextLine();

		System.out.println("Enter the Admin email id.....");
		String userEmailAddress = sc.nextLine();

		System.out.println("Set a password");
		userPassword = sc.nextLine();

		adminUser[0] = new Admin();
		adminUser[0].setName(userName);
		adminUser[0].setEmailAddress(userEmailAddress);
		adminUser[0].setPhoneNumber(userPhonenumber);

//		PavaSystem.out.println("Account created successfully");
	}
}