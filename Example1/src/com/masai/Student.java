package com.masai;

import java.io.Serializable;

public class Student implements Serializable {
	
	int id;
	String name;
	double marks;
	String city;
	int age;
	
	public Student(int id, String name, double marks, String city, int age) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.city = city;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Id : " + id + "    Name : " + name + "    Marks : " + marks + "    City : " + city + "    Age : " + age;
	}
	
	
	
	
	

}
