package com.first.lecture.ch06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		
		Student student = new Student();
		
		// 객체 접근 연산자를 사용하여 car 객체변수의 값을 참조
		System.out.println("company: " + car.company);
		System.out.println("model: " + car.model);
		System.out.println("color: " + car.color);
		System.out.println("maxSpeed: " + car.maxSpeed);
		System.out.println("speed: " + car.speed);
		
		
		car.speed = 100;
		
		System.out.println("speed: " + car.speed);
		
		alert();
	}
	
	public static int alert() {
		Car car = new Car();
		if(car.maxSpeed <= car.speed) {
			int over = car.speed-car.maxSpeed;
			System.out.println("현재 속도가 최고 속도보다 " +over+" 만큼 더 빠릅니다");
		} else {
			System.out.println("문제가 없습니다");
		}
		return 1;
	}

}
