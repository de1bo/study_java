package com.first.lecture.ch08;

public class Computer extends Calculator{

	@Override
	public double CirArea(int param) {
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		return PAI_2 * param * param;
	}
}
