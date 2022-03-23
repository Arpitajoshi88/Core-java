package com.xworkz.redbusapp.agency;

import com.xworkz.redbusapp.agency.TravelAgency;
import com.xworkz.redbusapp.Srs.SrsImplementation;
import com.xworkz.redbusapp.contract.RedBusContract;

public class RedBusTester {
	public static void main(String[] args) {
		
	


RedBusContract redBusContract = new  SrsImplementation();

TravelAgency agency = new TravelAgency(redBusContract);

          agency.booking(20);
 

}
}
