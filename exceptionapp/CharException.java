package com.xworkz.exceptionapp;

public class CharException {
	public static void main(String[] args) {
		System.out.println("main method started");
	
	 try {
		 
		   char a[]= new char [6];
		   a[0]='A';
		   a[1]='R';
		   a[2]='P';
		   a[3]='I';
		   a[4]='T';
	       a[5]='A';
	       //a[6]='A';
		  
		  for (int i = 0; i < a.length; i++) {
	    	  System.out.println(a[i]);
		  }
		  
	    }catch(Exception a) {
	    		  System.out.println("cannot add more elements in char array");
	    	  }
		  
		  try {
			  
			  String st = null;
			  String str = "null";
			  System.out.println(st.equals(str));
			 }catch(NullPointerException e) {
				// e.printStackTrace();
	         System.out.println(" u cannot access null data");
		}
		  System.out.println("Main method ended");

	}
	}






		
