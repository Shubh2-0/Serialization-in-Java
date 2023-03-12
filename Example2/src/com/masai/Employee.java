package com.masai;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private int id;
	private String name;
	private String city;
	private long mobileNumber;
	private int salary;
	transient private String password;
	
	
	public Employee(int id, String name, String city, long mobileNumber, int salary, String password) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobileNumber = mobileNumber;
		this.salary = salary;
		this.password = password;
	}


	@Override
	public String toString() {
		if(password==null) password = "CONFIDENCIAL";
		return "ID : " + id + "\nNAME : " + name+ "\nSALARY : " + salary + "\nPASSWORD : " + password + "\nCITY : " + city + "\nMOBILE NUMBER : " + mobileNumber + "\n==============================\n";
	}
	
	
	
	
	
	

}
