package com.first.lecture.ch02;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double var1 = 3.14;
		//float var2 = 3.14;
		float var3 = 3.14F;
		
		double var4 = 0.1234567890123456789;
		float var5 =  0.1234567890123456789f;
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		
		
		int var6 =300000;
		double var7 = 3e6;  // 10에 6승
		float var8 = 3e6F;	// 10에 6승
		double var9 = 2e-3; // 10에 -3승 소수정 자리
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
	}

}
