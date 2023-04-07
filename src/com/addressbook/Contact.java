package com.addressbook;

public class Contact {

	String firstName;
	String lastName;
	String city;
	String state;
	String zip;
	String phoneNumber;

	/*
	 * For Encapsulation, took instance variables. Which we are going to use through
	 * getter and setter methods.
	 */
	public Contact() {

	}

	// Declaration of parameterised constructor.
	public Contact(String firstName, String lastName, String city, String state, String zip, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
	        return "Contact{" +
	                "firstName='" + firstName + '\'' +
	                ", lastName='" + lastName +
	                ", city='" + city + '\'' +
	                ", state='" + state + '\'' +
	                ", zip='" + zip + '\'' +
	                ", phoneNumber='" + phoneNumber + '\'' +
	                '}';

}}
