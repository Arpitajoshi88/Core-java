package com.loops.forloop;

public class Split {
       public static void main(String[] args) {
		
    	   String name ="Laptop and mouse";
    	   String[]ch=name.split("");
    	   for(int i=ch.length-1;i>=0;i--) {
    		   System.out.println(ch[i]);
    	   }
	}
}