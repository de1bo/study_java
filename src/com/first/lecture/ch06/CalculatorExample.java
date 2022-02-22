package com.first.lecture.ch06;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculator calculator = new Calculator();
		
		calculator.powerOn();
		
		int result = calculator.plus(5,6);
		System.out.println("result: " + result);
		
		byte x= 10;
		byte y= 4;
		double result2 = calculator.divide(x,y);
		System.out.println("result2: " + result2);
		
		calculator.powerOff();
	}

}
