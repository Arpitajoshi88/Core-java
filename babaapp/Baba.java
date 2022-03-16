package com.xworkz.babaapp;

public class Baba {
   public static void main(String[] args) {
	   Baba baba = new Baba();
	   baba = null;
	   //System.gc();
	   Runtime.getRuntime().gc();
	   
   }
   @Override
   public void finalize() {
	   System.out.println("garbage collector");
   }
	   
   }
	

	   
   

