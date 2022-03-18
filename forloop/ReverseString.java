package com.loops;

public class ReverseString {
     public static void main(String[] args) {
    	 String str = "Arpita";
    	 System.out.println(str);
    	 
    	 char ch[]=str.toCharArray();
    	 System.out.println(ch.length);
    	 
    	 for(int j=ch.length-1; j>=0;j--) {
    		 System.out.print(ch[j]);
    	 }
     }
}
