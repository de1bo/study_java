package com.first.lecture.ch05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 갯수만 우선 정하고 데이터는 나중에 채워 넣겠다.
		
		String[] strArray = new String[3];
		
		strArray[0] = "김도현";
		strArray[1] = "김도현";
		strArray[2] = new String("김도현");
		
		for(int i=0; i<strArray.length; i++) {
			
			System.out.println(strArray[i]);
			
		}
		System.out.println(strArray[0] == strArray[1]); // true
		System.out.println(strArray[0] == strArray[2]);	// false
		
		System.out.println(strArray[0].equals(strArray[1]));	// ture
		System.out.println(strArray[0].equals(strArray[2]));	// ture
		
		
	}

}
