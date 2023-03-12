package com.masai;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SerializationDemo {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	ArrayList<Employee> employees = new ArrayList<>();
	
	employees.add(new Employee(1, "Akash", "Nagpur", 9320157219L, 450000, "aks1234"));
	employees.add(new Employee(2, "Paras", "Assam", 7689137291L, 20000, "par1234"));
	employees.add(new Employee(3, "Vipul", "Nagpur", 9320157219L, 350000, "vp1234"));
	employees.add(new Employee(4, "Nrupul", "Nagpur", 9320157219L, 32000, "np1234"));
	employees.add(new Employee(5, "Yogesh", "Nagpur", 9320157219L, 28000, "yo1234"));
	employees.add(new Employee(6, "Pratik", "Nagpur", 9320157219L, 250000, "ptk1234"));
	employees.add(new Employee(7, "Shivansh", "Baglore", 3213389057L, 650000, "shiv1234"));
	employees.add(new Employee(8, "Avinash", "Nagpur", 9320157219L, 550000, "avs1234"));
	employees.add(new Employee(9, "Lakhan", "Nagpur", 9320157219L, 180000, "lk1234"));
	employees.add(new Employee(10, "Ram", "Nagpur", 9320157219L, 300000, "r1234"));
	
	
	System.out.println("===================WELCOME========================");
	
	System.out.println("\n\nRECORDS OF THE EMPLOYEES\n\n");
	
	employees.forEach(e -> {
		
		System.out.println(e);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	});
	
	Scanner sc = new Scanner(System.in);
	System.out.println("\n\nTYPE INDEXS HERE IN WHICH YOU WANT TO PERFORM SERIALIZATION :- \n");
	System.out.println("PRESS 1 FOR FULL LIST");
	System.out.println("PRESS 2 FOR SPECIFIC INDEXS");
	int choice = sc.nextInt();
	
	ArrayList<Employee> employees2 = null;
	
	if(choice==1) {
       employees2 = employees;
	}
	else {
	
		System.out.print("Starting Index : ");
		int s = sc.nextInt();
		System.out.print("Ending Index : ");
		int e = sc.nextInt();
		
		List<Employee> temp = employees.subList(s, e);
	    employees2 = new ArrayList<>(temp);
		
	}
	
	
	
	Thread.sleep(1000);
	
	System.out.println("\n\nPLEASE WAIT YOUR DATA IS SERIALIZING........");
	
	Thread.sleep(2000);
	
	
	FileOutputStream fos = new FileOutputStream("EmployeeData");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	
	oos.writeObject(employees2);
	
	
	fos.close();
	oos.close();
	
	System.out.println("\n\nSERIALIZED SUCCESSFULLY......😊");
	
	
	
		
		
	}
	

}
