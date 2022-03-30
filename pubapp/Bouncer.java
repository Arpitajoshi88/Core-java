package com.xworkz.pubapp;

public class Bouncer {
   
	
	
	
	
	
	
	
	public void check(int age) throws PubException {
		if(age>=18) {
			System.out.println("Check in and enjoyyyy..........");
		}
		else if (age<18) {
			throw new PubException();
		}
	
	
	
}
}
