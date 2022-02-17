package com.first.lecture.function;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int sum = add(3,4);
//		System.out.println(sum);
		// public 리턴자료형 메소드명 ( 입력자료형1 입력변수1, 입력자료형2 입력변수2, ...) {
//			...
//			return 리턴값; // 리턴자료형이 void 인 경우에는 return 문이 필요없다.

//		int[] sum =  asd(3,4);
//		System.out.println(sum[1], sum[1]);
		
//		for(int a : asd(3,4)) {
//			System.out.println(a);
//		}
//		
//	}
		System.out.println("한식, 중식, 일식, 양식중 하나를입력하세요");
		Scanner scanner = new Scanner(System.in);
		String menuchoice = scanner.nextLine();
		menuchoice(menuchoice);
		
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
	
//	public static int add (int a, int b) {
//		
//		int sum = a+b;
//		
//		return sum;
//	}
//	public static int multiplication (int a, int b) {
//
//		int sum = a*b;
//		return sum;
//	}
//	
//public static int minus (int a, int b) {
//	
//		int sum = a-b;
//		return sum;
//	}
//public static int division (int a, int b) {
//	
//	int sum = a/b;
//	return sum;
//}




//public static int[] asd (int a, int b) {
//
//	
//	int t = a+b;
//	int x = a-b;
//	int y = a*b;
//	int z = a%b;
//	
//	int sum[] = {t, x, y, z};
//	
//	return sum;
//}
//
//// input: 문자열 개수에 상관없이
//// output : String
//
//	public static String aaa(String a, String b) {
//		
//	String ccc= a+b;	
//		
//		return "";
//	}

	// 오늘 뭐먹지 프로그램
//	배열 사용
//	함수 사용
//	출력을 위한 함수도 별도로 제작
//	
//	중식, 한식, 양식, 일식 선택시 출력 
//	오늘 추천 드리는 메뉴는 ? 입니다
	

	public static void menuchoice(String menuchoice) {
		
		int menu1 = (int) (Math.random() * (3-0 + 1) + 0);
		switch(menuchoice) {
		case "중식":	
			String[] china = {"짬뽕","탕수육","양장피","짜장면"};
			System.out.println("추천메뉴는 :"+china[menu1]) ;
			break;
		case "한식":
			String[] korea = {"비빔밥","갈비","불고기","김치"};
			System.out.println("추천메뉴는 :"+korea[menu1]) ;
			break;
		case "양식":
			String[] usa = {"스파게티","피자","치킨","??"};
			System.out.println("추천메뉴는 :"+usa[menu1]) ;
			break;
		case "일식":
			String[] japan = {"초밥","스키야키","오코노미야키","텐동"};
			System.out.println("추천메뉴는 :"+japan[menu1]) ;
			break;
		default:
			System.out.println("Error");
			break;
			
		}
		
		
	}

}




