package com.loops.forloop;

public class CountNumberOfWords {
	
	     
		public static void main(String args[]){
	     CountNumberOfWords.countWord("Arpita Joshi");
	}
	static int countWord(String str){
	    int count=0;
	    char[] ch=str.toCharArray();
	    for(int i=0; i<ch.length;i++) {
	    	count++;
	    }
	    System.out.println("Total element in a String are: "+count);
	    return count;

}
}
