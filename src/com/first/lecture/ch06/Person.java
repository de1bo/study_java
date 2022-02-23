package com.first.lecture.ch06;

public class Person {

	final String nation = "korea";		//1번  초기화
	final String ssn;
	String name;
	
	public Person(String name, String ssn) {		//2번 초기화 방법
		this.name = name;
		this.ssn = ssn;
	}
}
