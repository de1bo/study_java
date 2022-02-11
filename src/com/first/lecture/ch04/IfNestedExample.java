package com.first.lecture.ch04;

import java.util.Scanner;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int score = 67;
//		String grade = "";
//		
//		if(score >= 90) {
//			if(score >= 95) {
//				grade = "A+";
//			} else {
//				grade = "A";
//			}
//		} 
//		else if (score > 80) {
//			if (score >=85) {
//				grade = "B+";
//			} else {
//				grade = "B";
//			}  
//		}
//		else if (score > 70) {
//			 if (score >=75) {
//				grade = "C+";
//			} else {
//				grade = "C";
//			}  
//		}
//		else if (score > 60) {
//			 if (score >=65) {
//				grade = "D+";
//			} else {
//				grade = "D";
//		}  
//			} else {
//			grade = "F";
//		}
//			
//			System.out.println("학점은: " +grade);
			
			
		int x = 0;
		int y = 0;
		
		Scanner sc = new Scanner(System.in);
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x > 0) {
				if (y > 0) {
					System.out.println("1사분면");
				} else {
					System.out.println("4사분면");
				}
			} else {
				if (y>0) {
					System.out.println("2사분면");
				} else {
					System.out.println("3사분면");
				}
			}
}
	}
