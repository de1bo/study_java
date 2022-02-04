package com.first.lecture.ch02;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 명명법
		// 첫글자 소문자 그리고 다음 문자열 부터는 대문자
		// 모든 변수명은 붙여서 사용
		String fullName ="Dohyun kim";
		String name ="Dohyun";
		
		
		// 대소문자 구분함
		int roomNumber = 1;
		int roomnumber = 2;
		
		System.out.println("roomNumber" + roomNumber);
		System.out.println("roomnumber" + roomnumber);
		
		// 예약어는 사용할 수 없다.
//		int int =2;
		// 변수 초기화 (선언 후 처음으로 값 저장)
		int a;
		a=1;
		int b=1;
		
		int c = 0;
		
		c = a + b;
		
		System.out.println(c);
		
		//정수형은 0
		// 실수형은0.0
		//문자형은 '' 또는""
		boolean defaultNy = false;
		byte aa =0;
		short bb = 0;
		int cc=0;
		long dd =0;
		
		float ee = 0.0f;
		double ff = 0.0;
			
		//char gg ='';
		String hh ="";
		
		
		//변수 사용 (변수값 저장 & 변수값 읽음)
		// 리터럴 = 데이터이다
		// ex)정수형리터럴 = 정수형데이터
		
		System.out.println(c);
		System.out.println("Dohyun");
		System.out.println("Dohyun have" + c + "phone");
		
		System.out.println("한줄들여쓰기");
		System.out.println("\t한줄들여쓰기");
		
		System.out.println("한줄바꿈");
		System.out.println("\n한줄바꿈");
		
		System.out.println("한줄바꿈2");
		System.out.println("\r한줄바꿈2");
		
		System.out.println("\'나는 생각한다\'");
		System.out.println("소크라테스가 말했다.\"나는 존재한다.\"");
		System.out.println("\\");
		
		//변수의 범위
		//변수는 선언된 블럭 내에서만 사용 가능하다
		if(a == 1) {
			int aaa = 10;
			int bbb = aaa+ a;
			System.out.println("bbb: " +bbb);
		} else {
			
		}
		
//		boolean defaultNy = 1;
		
		
	}

}
