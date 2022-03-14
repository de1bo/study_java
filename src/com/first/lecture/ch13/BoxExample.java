package com.first.lecture.ch13;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box = new Box<String>();
		// Box 객체 중에서 한개 즉 제네릭 타입은 String으로 된것이다.
		// String t;
		
		
		box.set("sf");
		String str = box.get();
		System.out.println("str: " + str);
		
		Box<Integer> box2 = new Box<Integer>();
		// t : Integer t;
		box2.set(11);
		int number = box2.get();
		System.out.println("number: " + number);
		
	}

}
