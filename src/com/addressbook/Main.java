package com.addressbook;

public class Main {

	public static void main(String[] args) {
	System.out.println("welcome to address book program");
	AddressBook book=new AddressBook();
	book.addContact();
	System.out.println("First name : "+book.obj.getFirstName());
	System.out.println("Last name : "+book.obj.getLastName());
	System.out.println("city : "+book.obj.getCity());
	System.out.println("State : "+book.obj.getState());
	System.out.println("pincode : "+book.obj.getZip());
	System.out.println("phone number : "+book.obj.getPhoneNumber());
	book.edit();
	System.out.println("First name : "+book.obj.getFirstName());
	System.out.println("Last name : "+book.obj.getLastName());
	System.out.println("city : "+book.obj.getCity());
	System.out.println("State : "+book.obj.getState());
	System.out.println("pincode : "+book.obj.getZip());
	System.out.println("phone number : "+book.obj.getPhoneNumber());
	book.delete();
	System.out.println("First name : "+book.obj.getFirstName());
	System.out.println("Last name : "+book.obj.getLastName());
	System.out.println("city : "+book.obj.getCity());
	System.out.println("State : "+book.obj.getState());
	System.out.println("pincode : "+book.obj.getZip());
	System.out.println("phone number : "+book.obj.getPhoneNumber());
	
	
	}

}
