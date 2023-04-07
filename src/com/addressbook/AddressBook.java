package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	Contact obj = new Contact();
	ArrayList<Contact> list=new ArrayList<>();

	void addContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name");
		String firstname = sc.next();
		System.out.println("enter last name");
		String lastname = sc.next();
		System.out.println("enter city name");
		String city = sc.next();
		System.out.println("enter state name");
		String state = sc.next();
		System.out.println("enter pincode");
		String zip = sc.next();
		System.out.println("enter mobile number");
		String phonenumber = sc.next();
		obj.setFirstName(firstname);
		obj.setLastName(lastname);
		obj.setCity(city);
		obj.setState(state);
		obj.setZip(zip);
		obj.setPhoneNumber(phonenumber);

	}

	void edit() {
		System.out.println("enter name to be edit");
		Scanner sc1 = new Scanner(System.in);
		String newName = sc1.next();
		if (obj.getFirstName().equalsIgnoreCase(newName)) {
			System.out.println("enter first name");
			String firstname = sc1.next();
			System.out.println("enter last name");
			String lastname = sc1.next();
			System.out.println("enter city name");
			String city = sc1.next();
			System.out.println("enter state name");
			String state = sc1.next();
			System.out.println("enter pincode name");
			String zip = sc1.next();
			System.out.println("enter phone number name");
			String phonenumber = sc1.next();
			obj = new Contact(firstname, lastname, city, state, zip, phonenumber);
		} else {

			System.out.println("entered name is not exists in contact list");

		}
	}

	public void delete() { // This method is to delete a contact by name.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first name of the contact to delete the contact :");
		String deletedName = scanner.next();
		if (obj.getFirstName().equalsIgnoreCase(deletedName)) {
			System.out.println("The contact has deleted. ");
			obj.setFirstName(null);
			obj.setLastName(null);
			obj.setCity(null);
			obj.setState(null);
			obj.setZip(null);
			obj.setPhoneNumber(null);
		}

	}
	public void multipleContact() {
		list.add(obj);
	}

}
