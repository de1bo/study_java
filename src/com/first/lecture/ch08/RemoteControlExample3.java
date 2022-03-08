package com.first.lecture.ch08;

public class RemoteControlExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl remoteControl = new SmartTelevision();
		Searchable searchable = new SmartTelevision();
		
		remoteControl.turnOff();
		remoteControl.turnOn();
//		remoteControl.search();	// remoteControl클래스에는 search가 없어서 error
		
//		searchable.turnOff();	// 동일 error
//		searchable.turnOn();	// 동일 error
		searchable.search("김도현");
		
		
		
	}

}
