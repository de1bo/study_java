package com.first.lecture.ch04;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum =0;
		int sum_a = 0;
		int sum_b = 0;
		
		for (int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				sum = i*j;
				System.out.println(i+"*"+j+"=" +sum);
				
				// 계산한 값을 swich로 홀수인지 짝수인지 판별
				switch(sum%2) {
				 case 0:
					 sum_a += sum; 
					 break;
				 case 1:
					 sum_b += sum; 
					 break;	 
				}
			}
		}
		System.out.println("------------최종 합------------");
		System.out.println("짝수 합:" +sum_a);
		System.out.println("홀수 합:" +sum_b);
	}
}
