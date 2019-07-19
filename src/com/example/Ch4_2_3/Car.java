package com.example.Ch4_2_3;

public class Car {

	private String number ;
	
	private int usd ;
	
	private float rate ;
	
	private float ntd ;
	
	/**
	 * 建構子
	 * @param number
	 * @param usd
	 * @param rate
	 */
	public Car(String number, int usd, float rate) {
		this.number = number ;
		this.usd = usd ;
		this.rate = rate ;
		this.ntd = this.usd * this.rate ;
	}
	
	/**
	 * 取得成本台幣金額
	 * @return
	 */
	public float getNtd() {
		return this.ntd;
	}
	
	public void info() {
		System.out.println("車牌：" + this.number);
		System.out.println("成本(美金)：" + this.number);
		System.out.println("匯率：" + this.rate);
		System.out.println("成本(台幣)：" + this.ntd);
	}
	
}
