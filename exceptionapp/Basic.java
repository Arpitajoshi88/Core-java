package com.xworkz.exceptionapp;

import java.util.Iterator;

public class Basic {
	public static void main(String[] args) {
		
	   
	  try {
	   int a1[]= {1,2,3,4,5};
	   int a[]= new int[5];
	   a[0]=2;
	   a[1]=1;
	   a[2]=5;
	   a[3]=4;
	   a[4]=6;
       a[5]=7;
	  
	  for (int i = 0; i < a.length; i++) {
    	  System.out.println(a[i]);
	  }
	  }catch(ArrayIndexOutOfBoundsException ar) {
    		  System.out.println("cannot add more elements");
    	  }
	  
	  try {
		  
		  String st = null;
		  String str = "null";
		  System.out.println(st.equals(str));
		 }catch(NullPointerException e) {
			 e.printStackTrace();
         System.out.println("Gube.. u cannot access null data");
	}
	  System.out.println("Main method ended");

}
}





