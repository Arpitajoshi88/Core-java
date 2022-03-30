package com.xworkz.pubapp;


//costom checked Exception
public class PubException extends Exception{
     
	
	public PubException() {
		System.out.println(this.getClass().getSimpleName()+"Object is created");
	}
	@Override
	public String toString() {
		
		return "Boss/madam .. to young to enter in pub... please go home and study" ;
	}
}