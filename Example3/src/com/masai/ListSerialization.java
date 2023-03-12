package com.masai;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListSerialization {

	public static void main(String[] args) throws InterruptedException, IOException {
	
	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,4,2,8,2,6,10,34,23,02,49,7,29,32,54,87,59));
	
	System.out.println("\n===========================Welcome================================\n");
	
	System.out.println("You have following elements in list\n");
	
	
	System.out.println(list);
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("\nPess 1 for serializing only odd number");
	System.out.println("Pess 2 for serializing only even number");
	int c = sc.nextInt();
	
	while(c!=1 && c!=2) {
		
		System.out.println("Invalid option selection....");
		System.out.println("\nPess 1 for serializing only odd number");
		System.out.println("Pess 2 for serializing only even number");
	    c = sc.nextInt();
		
	}
	ArrayList<Integer> list2 = null;
	
	if(c==1) list2 = (ArrayList<Integer>) list.stream().filter(e -> e%2==1).collect(Collectors.toList());
	
	else list2 = (ArrayList<Integer>)list.stream().filter(e -> e%2==0).collect(Collectors.toList());
	
	
	
	
	System.out.println("\nplease wait system is processing your request.................\n\n");
	
	Thread.sleep(2000);
	
	FileOutputStream fis = new FileOutputStream("List");
	ObjectOutputStream oos = new ObjectOutputStream(fis);
	
	oos.writeObject(list2);
	
	fis.close();
	oos.close();
	System.out.println("\nnumbers serialized successfully");
	
	System.out.println("\n\nvisit again............😊");
	
	
	
		
		
	}
	
}
