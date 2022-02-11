package com.first.lecture.ch04;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num = 5;
		
//		Math.random(): 0.0 ~ 1.0에 가까운 double 형 값 보내줌
//		int num = Math.random() * (max-min + 1) + min
		
//		double num = Math.random();
//		System.out.println(num);
		
//		int num = (int) (Math.random() * (6 -1 +1 ) + 1);
//		
//		switch (num) {
//			case 1:
//				System.out.println("1번");
//				break;
//			case 2:
//				System.out.println("2번");
//				break;
//			case 3:
//				System.out.println("3번");
//				break;
//			case 4:
//				System.out.println("4번");
//				break;
//			case 5:
//				System.out.println("5번");
//				break;
//			default:
//				System.out.println("0");
//				break;
//			}
//		}

	// 첫번째 주사위는 몇번 입니다.
	// 두번째 주사위는 몇번 입니다.
	// 두수의 합은 얼마 입니다.
		int num2 = 0;
		int num;
		for (int i =1; i<3; i++) {
			 num = (int) (Math.random() * (6 -1 +1 ) + 1);
			 num2 = num2+ num;
			switch (i) {
			case 1:
				System.out.println("첫번째 값" +num);
				break;
			 case 2:
				 System.out.println("두번째 값" +num);
				 break;
			default :
				
				break;
			}
			
			}
		System.out.println("두수의 합은 " + num2 + "입니다.");
		}
		
		
		
		
		
		
		
		
//	int num1 = (int) (Math.random() * (6 -1 +1 ) + 1);
//	int num2 = (int) (Math.random() * (6 -1 +1 ) + 1);
//	int num3 = num1+num2;
//	
//	System.out.println("첫번째 주사위는" + num1 + "입니다.");
//	System.out.println("두번째 주사위는" + num2 + "입니다.");
//	System.out.println("두수의 합은 " + num3 + "입니다.");
		
}
	

