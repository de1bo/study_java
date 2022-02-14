package com.first.lecture.ch04;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 로또번호 중복되는값 있으면 다시
		// 1부터 45번까지 6개 뽑음
		// int num = Math.random() * (max-min + 1) + min

		int i = 1;

		switch (i) {
		case 1:
			int num1 = (int) (Math.random() * (45 - 1 + 1) + 1);
			i++;
		case 2:
			int num2 = (int) (Math.random() * (45 - 1 + 1) + 1);
			if (num2 != num1) {
				i++;
			} else {
				i = 2;
			}
		case 3:
			int num3 = (int) (Math.random() * (45 - 1 + 1) + 1);
			i++;
		case 4:
			int num4 = (int) (Math.random() * (45 - 1 + 1) + 1);
			i++;
		case 5:
			int num5 = (int) (Math.random() * (45 - 1 + 1) + 1);
			i++;
		case 6:
			int num6 = (int) (Math.random() * (45 - 1 + 1) + 1);
			i++;
			break;
		}

		
		  for (int i=0; i<=5; i++) {
		  
		  num = (int) (Math.random() * (45 -1 +1 ) + 1); System.out.println(+num);
		  
		  
		  if (num != num) { num = (int) (Math.random() * (45 -1 +1 ) + 1); } else {
		  System.out.println(+num); }
		  
		  
		  
		  }
		 

	}
}