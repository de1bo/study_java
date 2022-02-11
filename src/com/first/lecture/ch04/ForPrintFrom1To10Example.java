package com.first.lecture.ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		초기화식
//		조건식
//		증강식
//		int sum =0;
//		for (int i=1; i<=10; i++) {
//			
//			 sum += i;
//			
//			
//		}
//		System.out.println(sum);
		
		
		
		
//		for (int i=1; i<=10; i++) {
//			System.out.println(i);
//			for(int j=1; j<=10; j++) {
//				System.out.println(j);
//			}
//		}
		int sum =0;
		for (int i=2; i<=9; i++) {
			for(int j=1; j<=8; j++) {
				sum = i*j;
				System.out.println(i+"*"+j+"=" +sum);
			}
		}
		
		
		
//		int sum_a =0;
//		int sum_b =0;
		
//		for (int i=1; i<=10; i++) {
//			
//			 switch(i%2) {
//			 case 0:
//				 sum_a += i; 
//				 break;
//			 case 1:
//				 sum_b += i; 
//				 break;
//			 }	 
//		}
//		System.out.println("짝수 합:" +sum_a);
//		 System.out.println("홀수 합:" +sum_b);	
		 
		 
		 
		 
	}

}
