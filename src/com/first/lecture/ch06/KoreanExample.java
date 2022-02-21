package com.first.lecture.ch06;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Korean korean = new Korean();
		
		System.out.println("korean.nation : "+korean.nation);
		System.out.println("korean.name : "+korean.name);
		System.out.println("korean.ssn : "+korean.ssn);
		
		korean.name = "김도현";
		korean.ssn = "03031312345567";
		
		System.out.println("-------------------------");
		System.out.println("korean.nation : "+korean.nation);
		System.out.println("korean.name : "+korean.name);
		System.out.println("korean.ssn : "+korean.ssn);
		
		
		
		Korean korean2 = new Korean("김동현","05645645532");
		
		System.out.println("-------------------------");
		System.out.println("korean.nation : "+korean2.nation);
		System.out.println("korean.name : "+korean2.name);
		System.out.println("korean.ssn : "+korean2.ssn);
		
		Korean korean3 = new Korean("김지현","065568772");
		
		System.out.println("-------------------------");
		System.out.println("korean.nation : "+korean3.nation);
		System.out.println("korean.name : "+korean3.name);
		System.out.println("korean.ssn : "+korean3.ssn);
	}

}
