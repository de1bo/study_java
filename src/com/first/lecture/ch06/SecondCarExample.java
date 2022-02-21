package com.first.lecture.ch06;

public class SecondCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecondCar secondCar = new SecondCar();
		
		System.out.println("----------------------------");
		System.out.println("company: "+secondCar.company);
		System.out.println("model: "+secondCar.model);
		System.out.println("color: "+secondCar.color);
		System.out.println("maxSpeed: "+secondCar.maxSpeed);
		
		SecondCar secondCar2 = new SecondCar("프라이드");
		System.out.println("----------------------------");
		System.out.println("company: "+secondCar2.company);
		System.out.println("model: "+secondCar2.model);
		System.out.println("color: "+secondCar2.color);
		System.out.println("maxSpeed: "+secondCar2.maxSpeed);
		
		SecondCar secondCar3 = new SecondCar("프라이드","회색");
		
		System.out.println("----------------------------");
		System.out.println("company: "+secondCar3.company);
		System.out.println("model: "+secondCar3.model);
		System.out.println("color: "+secondCar3.color);
		System.out.println("maxSpeed: "+secondCar3.maxSpeed);
		
		SecondCar secondCar4 = new SecondCar("프라이드","회색",200);
		System.out.println("----------------------------");
		System.out.println("company: "+secondCar4.company);
		System.out.println("model: "+secondCar4.model);
		System.out.println("color: "+secondCar4.color);
		System.out.println("maxSpeed: "+secondCar4.maxSpeed);
	}

}
