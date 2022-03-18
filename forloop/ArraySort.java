package com.loops.forloop;

public class ArraySort {
	public static void main(String[] args) {
		int array[]= {20,10,80,30,90};
		int temp;
		for(int i=0; i<array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i]<array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}

	}
}
