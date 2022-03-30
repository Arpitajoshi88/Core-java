package com.xworkz.pubapp;


	import java.util.Scanner;

	public class AtmTester {
		public static void main(String[] args) throws AtmException {
			  
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the cash");
			int cash = sc.nextInt(); 
			
			
			Security security= new Security();
			try {
				Security.check(cash);
			
			}catch (AtmException e) {
				e.printStackTrace();
			}
		finally {	
			if(sc !=null)
			sc.close();

		}

	}
	}


