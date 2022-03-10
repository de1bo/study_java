package com.first.lecture.ch08;

public class DefaultMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface myInterface1 = new MyClassA();
		
		myInterface1.method1();
		myInterface1.method2();
		
		MyInterface myInterface2 = new MyClassB();
		
		myInterface2.method1();
		myInterface2.method2();

	}

}
