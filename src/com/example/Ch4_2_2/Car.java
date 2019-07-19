package com.example.Ch4_2_2;

public class Car {

	private String number ;
	
	private int usd ;
	
	private float rate ;
	
	private float ntd ;
	
	public Car(String number, int usd, float rate) {
		System.out.println("=====>new");
		this.number = number ;
		this.usd = usd ;
		this.rate = rate ;
	}
	
	public float getNtd() {
		return this.usd * this.rate ;
	}
	
}
