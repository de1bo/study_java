package com.first.lecture.ch06;

public class FifthCar {

	
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키들 돌립니다");
	}
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = 1;
			System.out.println("달립니다(시속:" + speed + "km/h)");
		}
	}

}
