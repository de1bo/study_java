package com.first.lecture.test;


public class RemoteControlExample {
	
	public static void main(String[] args) {
		
		Television television = new Television();
		RemoteControl remoteControl = new Television();
		
		television.turnOn();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		television.setVolume(100);
		RemoteControl.changeBattery();
		television.turnOff();
		
		System.out.println();
		
		
		
		remoteControl.turnOn();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		television.setVolume(-10);
		RemoteControl.changeBattery();
		television.turnOff();
	}

}
