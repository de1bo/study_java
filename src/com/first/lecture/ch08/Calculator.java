package com.first.lecture.ch08;

public class Calculator extends Constants{
	
	public double CirArea(int param) {
				/*(원의 반지름) X (원의 반지름) X (원주율)*/
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		double result1 = PAI_1 * param * param;
		return result1;
	}
}
