package com.first.lecture.ch07;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
		
//		supersonicAirplane.takeOff();
//		supersonicAirplane.fly();
//		supersonicAirplane.flyMode = SupersonicAirplane.SUPERSONIC;
//		supersonicAirplane.fly();
//		supersonicAirplane.flyMode = SupersonicAirplane.NORMAL;
//		supersonicAirplane.fly();
//		supersonicAirplane.land();
		
		
//		상수 생성 후 로드
		supersonicAirplane.takeOff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = Constants.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = Constants.NORMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();
	}

	
}
