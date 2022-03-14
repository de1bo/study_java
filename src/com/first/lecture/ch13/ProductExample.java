package com.first.lecture.ch13;

public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product<String, Integer> product = new Product<>();
		
		product.setKind("밴츠");
		product.setModel(400);
		
		System.out.println("내가 선물받는 차는: " + product.getKind()+ " : " + product.getModel()+ "입니다.");
		
		Product<Tv, String> product2 = new Product<>();
		
		product2.setKind(new Tv());
		product2.setModel("OLED TV");
		
		Tv rtTv = product2.getKind();
		String rtString = product2.getModel();
		
		// product -> setKind -> field로 대입
		System.out.println(rtTv + " : " + rtString);
		
		// Car
		
		Product<Car, String> product3 = new Product<>();
		
		product3.setKind(new Car());
		product3.setModel("레이");
		
		Car rtCar = product3.getKind();
		String rtString2 = product3.getModel();
		
		System.out.println(rtCar+ ": "+rtString2);
		
		
	}

}
