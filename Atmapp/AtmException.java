package com.xworkz.Atmapp;


	//costom checked Exception
	public class AtmException extends Exception{
	     
		
		public AtmException() {
			System.out.println(this.getClass().getSimpleName()+"Object is created");
		}
		@Override
		public String toString() {
			
			return "Sir/madam you can withdraw the amount only in multiples of hundred and you can't withdraw cash  greater than 10000" ;
		}
	}

