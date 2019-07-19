package com.example.Ch4_2_3;

public class Toyota extends Car {

	public Toyota(String number, int usd, float rate) {
		super(number, usd, rate);
	}
	
	public void info() {
		System.out.println("我是 Toyota");
	}

	public void myInfo() {
		super.info();
		this.info() ;
	}
	
}
