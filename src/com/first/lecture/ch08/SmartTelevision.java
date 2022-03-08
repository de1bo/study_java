package com.first.lecture.ch08;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;
	
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Television을 켭니다");
	}

	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Television을 끕니다");
	}

	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 television 볼륨: " + volume);
	}

	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "을 검색합니다");
	}
}
