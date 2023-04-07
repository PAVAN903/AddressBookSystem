package com.addressbook;

import java.util.Scanner;

public class AddressBook {
	Contact obj=new Contact();
	void addContact() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name");
		String firstname=sc.next();
		System.out.println("enter last name");
		String lastname=sc.next();
		System.out.println("enter city name");
		String city=sc.next();
		System.out.println("enter state name");
		String state=sc.next();
		System.out.println("enter pincode");
		String zip=sc.next();
		System.out.println("enter mobile number");
		String phonenumber=sc.next();
		obj.setFirstName(firstname);
		obj.setLastName(lastname);
		obj.setCity(city);
		obj.setState(state);
		obj.setZip(zip);
		obj.setPhoneNumber(phonenumber);
		
	}

}
