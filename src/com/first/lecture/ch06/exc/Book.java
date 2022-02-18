package com.first.lecture.ch06.exc;

import java.util.Date;

public class Book {

	String bookType ="";
	String bookName = "";
	Integer bookPrice = 0;
	String bookBuyPlaceCd = "";
	Date bookpublishDate;
	String publisher = "";
	Date bookBuyDate;
	String bookBuyType= ""; // 회사에서 산건지 개인으로 산건지
	
	
	public void search(String bookType, String bookName, String publisher) {
		
	
	}
}




//회사에서 정기적으로 책을 구매 회사 입장에서 어떤 책을 사놨는지 지금보유 책이 어떤건지 하는거를 관리하고 싶어함
//첫뻔지 들어가면 보유 책
//어떻게 어디서 얼마에 산 데이터
//
//도서 클래스 만들기