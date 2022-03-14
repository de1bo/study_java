package com.first.lecture.ch13;

public class ItemExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product<Car, Integer> product = new Product<>();
		
		product.setKind(new Car());
		product.setModel(400);
		
		Car rtCar = product.getKind();
		int rtString = product.getModel();
		
		System.out.println(rtCar + " : " + rtString);
	}

}
