package com.loops.forloop;

public class LowerCase {
  public static void main(String[] args) {
	  LowerCase.lower('A');
 }
  static char lower(char anychar) {
	  char lowerChar= (char)((int)anychar+32);
	  System.out.println("LowerCase of "+anychar+" is "+lowerChar);
	  return lowerChar;
  }
}
