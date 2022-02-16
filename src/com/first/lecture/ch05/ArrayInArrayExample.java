package com.first.lecture.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		2 * n : (행 * 열) : 가로 * 세로
		
		int[][] scores = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44}, {55,44}};
		
		int[][] scores2 = new int[3][2];
		
		int[][] score3 = new int[3][];
		score3[0] = new int[2];
		score3[1] = new int[2];
		score3[2] = new int[2];
		
		System.out.println("scores.length:"+ scores.length);
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i].length);		// 행
			
			for(int j = 0; j<scores[i].length; j++) {
				System.out.println("score["+i+"]["+j+"]: "+ scores[i][j]); //열
			}
			 System.out.println();
		}
		scores[3][1] = 100;
		System.out.println("scores[3][1]: " +scores[3][1]);
	}

}
