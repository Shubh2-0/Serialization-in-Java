package com.masai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeSerializationExample {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		
	
		System.out.println("Welcome😊😊");
		
		System.out.println("\n\nPlease wait your data is fetching");
		
		Thread.sleep(3000);
		
		
		
		
	FileInputStream fis = new FileInputStream("StudentData");
	
    ObjectInputStream ois = new ObjectInputStream(fis);
    
    ArrayList<Student> studentData = null;
    
    
   studentData = (ArrayList<Student>)ois.readObject();
   
  
  
   
   fis.close();
   ois.close();
   
   System.out.println("\n\nData fetched successfully\nWait it will be printing......\n");
   
   Thread.sleep(2000);
   
   studentData.forEach(e -> {
	
	   System.out.println(e);
	   try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	   
	   
   });
    
	
		
		
	}

}
