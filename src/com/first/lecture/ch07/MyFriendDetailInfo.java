package com.first.lecture.ch07;

public class MyFriendDetailInfo extends MyFriendInfo{

	
	private String strAddress = "strAddress";
	private String strNumber = "strNumber";
	
	public void printAddress() {
		System.out.println("경기도 광명시");
	}
	public void printNumber() {
		System.out.println("01012345678");
	}
	public String getStrAddress() {
		return strAddress;
	}
	public void setStrAddress(String strAddress) {
		this.strAddress = strAddress;
	}
	public String getStrNumber() {
		return strNumber;
	}
	public void setStrNumber(String strNumber) {
		this.strNumber = strNumber;
	}
	
	

	
	
}
