package com.first.lecture.ch07;

public class DmbCellphone extends Cellphone{

	
	int channel;
	
	DmbCellphone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널" + channel + " 번 DMb 방송 수신을 시작힙니다.");
	}
	void changeChanneldmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + " 번으로 바꿉니다");
	}
	void turnOffDmb() {
		System.out.println("DBM 방송 수신을 멈춥니다.");
	}
}
