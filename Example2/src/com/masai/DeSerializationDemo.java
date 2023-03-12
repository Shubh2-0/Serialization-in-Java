package com.masai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DeSerializationDemo {
	
	public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
	
		
		System.out.println("====================WELCOME===================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nPRESS 1 FOR DE-SERIALIZE YOUR DATA");
		int c = sc.nextInt();
		
		while(c!=1) {
			System.out.println("\nPLEASE PROVIDE VALID INPUT......");
			System.out.println("\nPRESS 1 FOR DE-SERIALIZE YOUR DATA");
			System.out.println("\nPRESS 0 FOR EXIT THE PROGRAM\n");
			
			c = sc.nextInt();
			
			if(c==0) {
				System.out.println("THANK YOU FOR USING OUR SERVICES......VISIT AGAIN😊");
				System.exit(0);
			}
			
		}
		
		System.out.println("\nPLEASE WAIT YOUR DATA IS DE-SERIALIZING");
		
		Thread.sleep(2000);
		
		FileInputStream fis = new FileInputStream("EmployeeData");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
	
		
		ArrayList<Employee> data = (ArrayList<Employee>) ois.readObject();
		
		
		fis.close();
		ois.close();
		
		System.out.println("DE-SERIALIZED SUCCESSFULLY.....😊");
		
		System.out.println("\n\nPRESS 1 FOR PRINTING THE DATA");
		System.out.println("PRESS 0 FOR EXIT THE PROGRAM");
		
		int user = sc.nextInt();
		
		System.out.println("\n\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\n");
		
		while(user!=1 && user!=0) {
			System.out.println("\nWRONG SELECTION.....");
			System.out.println("PRESS 1 FOR PRINTING THE DATA");
			System.out.println("PRESS 0 FOR EXIT THE PROGRAM");
			user = sc.nextInt();
		}
		
		if(user==0) System.exit(0);

		
		
		data.forEach(e -> {
			System.out.println(e);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
		
		
		
		
		
	}

}
