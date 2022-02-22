package com.first.lecture.ch06;

public class ThirdCalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThirdCalculator thirdCalculator = new ThirdCalculator();
		
		double result1 = thirdCalculator.areaRectangle(3);
		double result2 = thirdCalculator.areaRectangle(3,5);
		
		System.out.println("정사각형의 넓이: " +result1);
		System.out.println("직사각의 넓이: " +result2);
	}

}
