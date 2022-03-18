package com.loops.forloop;

public class Reversestring1 {

	public static void main(String[] args) {
		 Reversestring1.reverse("Arpita");
	}
	static String reverse(String name) {
		char[] chs = name.toCharArray();
		String revName ="";
		
		for(int index=chs.length-1;index >=0;index--) {
			revName=revName+chs[index];
			System.out.println(revName);
		}
	
		return revName;	
		}
}
	