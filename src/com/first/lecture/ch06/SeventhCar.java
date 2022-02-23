package com.first.lecture.ch06;

public class SeventhCar {

	int speed= 0;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// static 사용할 수 있는 방법 static 안에 객체를 생성 하거나 static으로 만들어진 함수나 필드에 있는 값을 사용
		SeventhCar seventhCar = new SeventhCar(); // 객체
		
		seventhCar.speed=10;
		seventhCar.run();
	}

}
