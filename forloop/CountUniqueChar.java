package com.loops.forloop;

public class CountUniqueChar {

	public static int unique(String str) {
		int count = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length - 1; i++) {
			int num = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					num++;
					ch[j] = ' ';
				}
				// System.out.println("Number of unique characters are:"+count);
			}
			if (ch[i] != ' ' && num == 1)
				count++;
		}
		System.out.println("Number of unique character are:" + count);
		return count;
	}

	public static void main(String[] args) {
		CountUniqueChar.unique("dry fruits");

	}
}
