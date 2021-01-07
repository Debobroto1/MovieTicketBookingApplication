//Array Runner
package com.runner;

import java.util.Scanner;

import com.accounts.Admin;
import com.datatypes.Address;

public class Runner {
	private static Address[] userAddress;
	private static Admin[] adminUser;
	private static String userPassword;
	private static Scanner sc;
	private static int index=0;

	public static void main(String[] args) {
		userAddress =new Address[10];
		adminUser=new Admin[10];
		
		sc=new Scanner(System.in);
		String userChoice="y";
		System.out.println("=============Welcome to the  MTB Application==============");
		System.out.println("What you want to do  today");
		while(userChoice.equalsIgnoreCase("Y")) {
		System.out.println("1. Add Admin");
		System.out.println("2. Add Customer");
		System.out.println("3. FDO");
		System.out.println("4. GetInfo");
		System.out.println("Enter a choice [1 to 4]");

		// You want to take input from the user
		short userOption = sc.nextShort();
		if (userOption == 1) {
		System.out.println("You have eneter the option " +userOption);
		addPersonalInfo();
		setAddressInfo();
		getAccountInfo(adminUser[index-1]);
		}
		else if  (userOption == 2) {
			System.out.println("Enter Customer");
		}
		else if  (userOption == 3) {
			System.out.println("Enter FDO");
		}
		else if  (userOption == 4) {
			System.out.println("Entering ID");
			short id=sc.nextShort();
			getAccountInfo(adminUser[id]);
		}
		else {
			System.out.println("Invalid Input ,retry again!!!!!!!!");
			}
		System.out.println("Do you want to continue? Y or N :");
		userChoice=sc.next();
		System.out.println("Yoour choice " +userChoice);
	}
		System.out.println("Thank you and have a good day!!");
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
		adminUser[index].setAddress(address);
		adminUser[index].createAccount(userPassword);
		index=index+1;
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

		adminUser[index] = new Admin();
		adminUser[index].setName(userName);
		adminUser[index].setEmailAddress(userEmailAddress);
		adminUser[index].setPhoneNumber(userPhonenumber);

//		PavaSystem.out.println("Account created successfully");
	}
}