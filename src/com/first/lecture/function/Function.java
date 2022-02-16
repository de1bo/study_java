package com.first.lecture.function;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int sum = add(3,4);
//		System.out.println(sum);
		// public 리턴자료형 메소드명 ( 입력자료형1 입력변수1, 입력자료형2 입력변수2, ...) {
//			...
//			return 리턴값; // 리턴자료형이 void 인 경우에는 return 문이 필요없다.

		int sum = multiplication(3,4);
		System.out.println(sum);
		
	}
	// 함수 선언
//	public static int add (int a, int b) {
//		
//		int sum = a+b;
//		
//		return sum;
//	}
//		
//	public int aaa (int a, int b, int c, String d, boolean e) {
//		System.out.println(a);
//		return 1;
//	
//	}
	
	public static int multiplication (int a, int b) {

		int sum = a*b;
		return sum;
	}
	
public static int minus (int a, int b) {
	
		int sum = a-b;
		return sum;
	}
public static int division (int a, int b) {
	
	int sum = a/b;
	return sum;
}



public static int[] asd (int a, int b) {

	
	int t = a+b;
	int x = a-b;
	int y = a*b;
	int z = a%b;
	
	int result[] = {t, x, y, z};
	
	
	return result;
	
}
	





}
