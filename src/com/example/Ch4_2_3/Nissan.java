package com.example.Ch4_2_3;

public class Nissan extends Car {

	public Nissan(String number, int usd, float rate) {
		super(number, usd, rate);
	}
	
	public void myInfo() {
		super.info();
		System.out.println("我是 Nissan");
	}
	
}
