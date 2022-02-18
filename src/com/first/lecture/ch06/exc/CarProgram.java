package com.first.lecture.ch06.exc;

public class CarProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		
		//객체 = Car이라는 함수를 실행 시키겠다
		Car car =  new Car();
		
		Car car2;
		car2 = new Car();
		
		
//		1은 객체접근연산자 객체변수명.필드명
//		car.company;
		
		System.out.println("car.company: " + car.company);
		
		car.c = car.a + car.b;
		
		System.out.println("car,c:" + car.c);
		
		car.c = car.speedUp(10);
		
		System.out.println("car.c: " + car.c);
	}

}
