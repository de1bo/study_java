package com.first.lecture.ch04;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			
			// Math.random() * (max - min + 1) + min
			// 0.0 ~ 1.0 에 가까운 double 형 변환
			
			int num = (int) ((Math.random()*6) + 1);
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("process ended!");
	}

}
