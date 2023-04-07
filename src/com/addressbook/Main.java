package com.addressbook;

import java.util.Scanner;

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
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the  number. ");
     System.out.println(" 1. Add Contact \n 2. Edit Contact \n 3. Delete Contact \n 4. Add Multiple Contact \n");
     int multiple= sc.nextInt();
     switch (multiple) {
         case 1:
            book.addContact();
             System.out.println(book.obj.getFirstName());
             System.out.println(book.obj.getLastName());             
             System.out.println(book.obj.getCity());
             System.out.println(book.obj.getState());
             System.out.println(book.obj.getZip());
             System.out.println(book.obj.getPhoneNumber());
             break;
         case 2:
            book.edit();
             System.out.println(book.obj.getFirstName());
             System.out.println(book.obj.getLastName());
             System.out.println(book.obj.getCity());
             System.out.println(book.obj.getState());
             System.out.println(book.obj.getZip());
             System.out.println(book.obj.getPhoneNumber());
             break;
         case 3:
            book.delete();
             System.out.println(book.obj.getFirstName());
             System.out.println(book.obj.getLastName());
             System.out.println(book.obj.getCity());
             System.out.println(book.obj.getState());
             System.out.println(book.obj.getZip());
             System.out.println(book.obj.getPhoneNumber());
             break;
         case 4:
            book.multipleContact();
           book.multipleContact();
           book.multipleContact();
             System.out.println(book.list);
             break;
         default:
             System.out.println("wrong name");
	
	
	}

}
}