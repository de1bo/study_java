package com.first.lecture.ch08;

public interface MyInterface {
	void method1(); // public abstract

	default void method2() {
		System.out.println("MyInterface-method2() 실행");
	}
}
