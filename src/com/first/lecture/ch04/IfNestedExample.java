package com.first.lecture.ch04;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 86;
		String grade = "";
		
		if(score <= 100){
			grade = "A+";
			 if(score <= 95) {
				grade = "A";
			} if(score <= 90) {
				grade = "B+";
			} if(score <= 85) {
				grade = "B";
			}if(score <= 80) {
				grade = "C+";
			}if(score <= 75) {
				grade = "C";
			}if(score <= 70) {
				grade = "D+";
			}if(score <= 65) {
				grade = "D";
			
		}
		
		System.out.println("학점은: " +grade);
	}

	}
}
