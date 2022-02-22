package com.first.lecture.ch06;

public class ThirdCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ThirdCar ThirdCar = new ThirdCar();
		
		System.out.println("----------------------------");
		System.out.println("company: "+ThirdCar.company);
		System.out.println("model: "+ThirdCar.model);
		System.out.println("color: "+ThirdCar.color);
		System.out.println("maxSpeed: "+ThirdCar.maxSpeed);
		
		ThirdCar ThirdCar2 = new ThirdCar("자가용");
		System.out.println("----------------------------");
		System.out.println("company: "+ThirdCar2.company);
		System.out.println("model: "+ThirdCar2.model);
		System.out.println("color: "+ThirdCar2.color);
		System.out.println("maxSpeed: "+ThirdCar2.maxSpeed);
		
		ThirdCar ThirdCar3 = new ThirdCar("자가용","빨강");
		
		System.out.println("----------------------------");
		System.out.println("company: "+ThirdCar3.company);
		System.out.println("model: "+ThirdCar3.model);
		System.out.println("color: "+ThirdCar3.color);
		System.out.println("maxSpeed: "+ThirdCar3.maxSpeed);
		
		ThirdCar ThirdCar4 = new ThirdCar("자가용","빨강",200);
		System.out.println("----------------------------");
		System.out.println("company: "+ThirdCar4.company);
		System.out.println("model: "+ThirdCar4.model);
		System.out.println("color: "+ThirdCar4.color);
		System.out.println("maxSpeed: "+ThirdCar4.maxSpeed);
	}

}
