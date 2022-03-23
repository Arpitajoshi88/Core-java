package com.xworkz.redbusapp.agency;

import com.xworkz.redbusapp.contract.RedBusContract;

public class TravelAgency {


                                                                      
      // has-a relation
     RedBusContract redBusContract ;
    static String name = "Sri ShriShail travel agency";
    
    public TravelAgency(RedBusContract redBusContract) {
    	super();
    	this.redBusContract=redBusContract;
    }
    

  public boolean booking(int noOfbookings) {
	  boolean booking=false;
	  System.out.println("inside booking()");
	  boolean warrenty= redBusContract.warrenty();
	  
	  if(warrenty) {
		  System.out.println("checked warrenty ... please proceed");
	  
		  if(noOfbookings <= redBusContract.minBooking()) {
			  
		
		  System.out.println("booking successful");
		   booking = true;
		  }
		  else {
			  System.out.println("cant proceed eith booking .. As no bookings is exceeding the limits");
		  }
		  
	  
    System.out.println("end of booking()");
  }
	return booking;
  }
}

