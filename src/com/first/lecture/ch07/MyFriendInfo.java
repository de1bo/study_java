package com.first.lecture.ch07;

public class MyFriendInfo {

	private String strName = "strName";
	private String strAge = "strAge";
	
	public void printName() {
		System.out.println("김도현");
	}
	public void printAge() {
		System.out.println("25살");
	}
	
	
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrAge() {
		return strAge;
	}
	public void setStrAge(String strAge) {
		this.strAge = strAge;
	}
	
	
}
