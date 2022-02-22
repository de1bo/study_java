package com.first.lecture.ch06;

public class FourthCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FourthCar fourthCar = new FourthCar();
		
		fourthCar.setGas(5);
		
		boolean gasState = fourthCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다");
			fourthCar.run();
		}
		
		if(fourthCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 있습니다");
		} else {
			System.out.println("gas를 주입하세요");
		}
	}

}
