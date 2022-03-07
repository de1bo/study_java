package com.first.lecture.ch08;

public class Television implements RemoteControl {

	
	//필드
	private int television;
	
	@Override
	public void turnOn() {
		System.out.println("Television을 켭니다");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Television을 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if(television>RemoteControl.MAX_VOLUME) {
			this.television = RemoteControl.MAX_VOLUME;
		} else if(television<RemoteControl.MIN_VOLUME) {
			this.television = RemoteControl.MIN_VOLUME;
		} else {
			this.television = volume;
		}
		System.out.println("현재 television 볼륨: " + television);
		
	}

	public int getVolume() {
		return television;
	}

	
}
