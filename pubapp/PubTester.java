package com.xworkz.pubapp;

import java.util.Scanner;

public class PubTester {
	public static void main(String[] args) throws PubException {
		  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt(); 
		
		
		Bouncer bouncer = new Bouncer();
		try {
			bouncer.check(age);
		
		}catch (PubException e) {
			e.printStackTrace();
		}
	finally {	
		if(sc !=null)
		sc.close();

	}

}
}
