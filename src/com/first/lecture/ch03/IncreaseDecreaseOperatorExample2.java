package com.first.lecture.ch03;

public class IncreaseDecreaseOperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 0;
		int z;
		
		System.out.println("-----------------------");
		x++;
//		++x;
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("-----------------------sdffd");
		z = x++; // 12
		System.out.println("z=" + z); // 11
		System.out.println("x=" + x); // 12
		
		System.out.println("-----------------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}
