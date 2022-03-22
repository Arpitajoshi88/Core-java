package com.xworkz.scannerApp.bankApp;

public class Bankfactory {
public static Atm getBank(String type) {
	if(type.equalsIgnoreCase("Sbibank")) {
		return new SbibankImpl();
	}
	else if(type.equalsIgnoreCase("Idbibank")){
		return new IdbibankImpl();
	}
	
	else {
		System.out.println("invalid atm card");
	}
   return null;
}
}
