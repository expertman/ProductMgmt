package com.example;

public class Output {
	private Product [] array;

	public Output(Product[] array) {
		this.array = array;
	}
	
	public void output() {
		this.printLabel();
		for(Product p : this.array) {
			System.out.println(p);   //p.toString()
		}
	}
	
	private void printLabel() {
		System.out.println("                                  <<상품별 판매 이익금 및 이익율표>>");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("상품명            수량         판매단가         매입단가         운송료        이익금         이익율");
		System.out.println("-------------------------------------------------------------------------------------------");
	}
}
