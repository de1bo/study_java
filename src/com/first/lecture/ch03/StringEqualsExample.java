package com.first.lecture.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "김도현";
		String str2 = "김도현";
		String str3 = new String("김도현");
		
		boolean result1 = (str1 == str2); 	// default값으로 간다면 주소값이 같은지 바교하기 때문에 true가 됨
		System.out.println("result1=" + result1);
		
		boolean result2 = (str1 == str3);			// 문자열을 비교하기 위해 .equals를 사용해야함
		System.out.println("result2=" + result2);
		
		System.out.println("str1.equals(str2): " +str1.equals(str2));
		System.out.println("str1.equals(str3): " +str1.equals(str3));
	}

}
