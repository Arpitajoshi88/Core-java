package com.loops.forloop;

public class UpperCase {
  public static void main(String[] args) {
	  UpperCase.upper('a');
  }
	static char upper(char lowerChar) {
		char upperChar= (char) ((int)lowerChar-32);
		System.out.println("UpperCase of "+lowerChar+" is "+upperChar);
		return upperChar;
		
	}
}
	


