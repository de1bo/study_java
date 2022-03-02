package com.first.lecture.ch07;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student("Dohyun", "1234-1234", 0);
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		Student student2 = new Student("crystal", "1234-1234-65456", 0);
		
		System.out.println(student2.name);
		System.out.println(student2.ssn);
		System.out.println(student2.studentNo);
		
		
	}

}
