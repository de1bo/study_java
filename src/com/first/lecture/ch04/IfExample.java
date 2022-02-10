package com.first.lecture.ch04;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int score = 89;
		
		if(score > 90) {
			System.out.println("점수가 90 보다 큽니다");
			System.out.println("등급은 A입니다");
		} 
		// 블록을 구성하지 않으면 바로 다음줄 까지만 블럭내의 문장으로 이해하고 실행 시킨다. ex) 1과 2를 한문장으로 보기때문에 출력하지 않음
		if (score < 90) 								// 1		
			System.out.println("점수가 90보다 작습니다.");	// 2 
			System.out.println("등급은 B 입니다");
		
	}

}
