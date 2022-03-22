package com.xworkz.scannerApp.bankApp;

public class Banktester {
  public static void main(String[] args) {
	SbibankImpl bankImpl=new SbibankImpl();
	bankImpl.swipe();
	
	IdbibankImpl bankImpl1=new IdbibankImpl();
	bankImpl1.swipe();
}
}
