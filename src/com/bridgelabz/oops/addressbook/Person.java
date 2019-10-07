package com.bridgelabz.oops.addressbook;

public class Person {

	String firstname;
	String lastname;
	String mobno;
	Address address;

	public Person() {
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person(String firstname, String lastname, String mobno, Address address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobno = mobno;
		this.address = address;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

}
