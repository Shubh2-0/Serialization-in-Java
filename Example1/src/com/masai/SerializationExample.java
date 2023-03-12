package com.masai;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationExample {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
	
	System.out.println("Welcome");
	
	System.out.println("\n\nPlease wait you data is serializing....");
	Thread.sleep(4000);
		
	ArrayList<Student> list = new ArrayList<>();
	
	
	list.add(new Student(1, "Shivansh", 549.7, "Banglore", 21));
	list.add(new Student(2, "Rudra", 259.2, "Assam", 29));
	list.add(new Student(3, "Karn", 449.4, "Jaipur", 25));
	list.add(new Student(4, "Deva", 129.1, "Goa", 23));
	Student st5 =  new Student(5, "Omkar", 349.2, "Mizoram", 27);
	list.add(st5);
	
	FileOutputStream fos = new FileOutputStream(new File("StudentData"));
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	
	oos.writeObject(list);
	
	oos.close();
	
	System.out.println("\n\nYour data is successfully serialized.......😊😊");
	
		
		
	}
	

}
