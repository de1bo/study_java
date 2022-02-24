package com.first.lecture.ch07;

public class MyFriendDetailInfoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFriendDetailInfo myFriendDetailInfo = new MyFriendDetailInfo();
		
		myFriendDetailInfo.printName();
		myFriendDetailInfo.printAge();
		myFriendDetailInfo.printAddress();
		myFriendDetailInfo.printNumber();
		
		System.out.println("이름: " +myFriendDetailInfo.getStrName());
		System.out.println("나이: " +myFriendDetailInfo.getStrAge());
		System.out.println("주소: " +myFriendDetailInfo.getStrAddress());
		System.out.println("전화: " +myFriendDetailInfo.getStrNumber());
	}

}
