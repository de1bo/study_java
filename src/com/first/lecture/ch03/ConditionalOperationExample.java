package com.first.lecture.ch03;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int score = 85;
		
//		char grade = (score > 90 ? 'A' : 'B');
		char grade = (score > 90 ? 'A' : (score > 80 ? 'B' : 'C'));
		
		System.out.println("grade: " + grade);
		
//		String str = "김도현";
		
//		String str1 = ((str1.equals("김도현")));
	}

}
