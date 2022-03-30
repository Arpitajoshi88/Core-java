package com.xworkz.Atmapp;

public class Security {

	public static  void check(int cash) throws  AtmException {
		if(cash<=10000) {
			System.out.println("Then you can withdraw the amount");
		}
		
		else if (cash>10000) {
			throw new AtmException();
		}
	
	
}
}
