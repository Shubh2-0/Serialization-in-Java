package com.masai;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ListDeSerialization {
	
	public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
		
	
		System.out.println("===============welcome==============");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\npress 1 for de-serialze your data");
		System.out.println("\npress 0 for exit");
		int c = sc.nextInt();
		
		while(c!=1 && c!=0) {
			
			System.err.println("\n\nwrong selection.........");
			System.out.println("\npress 1 for de-serialze your data");
			System.out.println("\npress 0 for exit");
			c = sc.nextInt();
		}
		
		if(c==0) {
			System.out.println("\n\nthank you for using our services................visit again😊\n\n");
			System.exit(0);
		}
    
		System.out.println("\n\nplease wait your data is de-serializing..");
		Thread.sleep(1000);
		
		
		FileInputStream fis = new FileInputStream("List");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
	
		
		fis.close();
		ois.close();
		
		System.out.println("\n\nde-serialzed successfully");
		
		System.out.println("press 1 for printing the number");
		System.out.println("press 0 for exit");
		
		int c2 = sc.nextInt();
		
	while(c!=1 && c!=0) {
			
			System.err.println("\n\nwrong selection.........");
			System.out.println("\npress 1 for priting the data");
			System.out.println("\npress 0 for exit");
			c = sc.nextInt();
		}
		
		if(c==0) {
			System.out.println("\n\nthank you for using our services................visit again😊\n\n");
			System.exit(0);
		}
		
		
             System.out.println("\n\n");
		
		list.forEach(e ->{
			System.out.println("number is "+e);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
		System.out.println("\n\nthank you for using our services................visit again😊\n\n");
		
		
	}

}
