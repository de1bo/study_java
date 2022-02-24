package com.first.lecture.ch07;

public class CellphoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DmbCellphone dmbCellphone = new DmbCellphone("자바폰", "검정", 10);
		
		 System.out.println("요일: " + dmbCellphone.model);
		 System.out.println("생상: " + dmbCellphone.color);
		 
		 System.out.println("채널: " + dmbCellphone.channel);
		 
		 dmbCellphone.powerOn();
		 dmbCellphone.bell();
		 dmbCellphone.sendVoice("여보세요");
		 dmbCellphone.receiveVoice("안녕하세요! 저는 김도현인데요");
		 dmbCellphone.sendVoice("아~ 예 반갑습니다.");
		 dmbCellphone.hangUp();
		 
		 
		 dmbCellphone.turnOnDmb();
		 dmbCellphone.changeChanneldmb(12);
		 dmbCellphone.turnOffDmb();
	}

}
