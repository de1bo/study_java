package com.first.lecture.ch02;

public class GarbageValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte var1 = 125;
		int var2 = 125;
		
		for(int i =0; i < 5 ; i++) {
			
			var1++;
			var2++;
			System.out.println("var: " + var1+ "\t" + "var2: " + var2);
		}
	}

}
