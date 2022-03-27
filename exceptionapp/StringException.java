package com.xworkz.exceptionapp;

public class StringException {
	public static void main(String[] args) {
		System.out.println("main method started");
	
	 try {
		 
		   String a[]= new String [6];
		   a[0]="Nidhi";
		   a[1]="Sneha";
		   a[2]="Seema";
		   a[3]="Akshata";
		   a[4]="Sanjana";
	       a[5]="Spoorti";
	      //a[6]="Ankita";
		  
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






		


