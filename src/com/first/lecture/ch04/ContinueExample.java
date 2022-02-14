package com.first.lecture.ch04;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i=1; i<=10; i++) {
//			if(1%2 != 0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		int a = 1;
		
		while(a<=10) {
			if(a%2 == 0) {
				continue;
			}
			
			System.out.println(a);
			a++;
		}
	}

}
