package com.example;

public class Ch_3_1_1 {

	public static void main(String[] args) {
		
		//型號分成二種：基本型態和類別型態
		
		//基本型態的整數類
		byte high = 100 ;
		short weight = 300 ;
		int score = 100 ;
		long distance = 30000 ;
		
		//區間範例
		System.out.println("Byte : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE) ;
		System.out.println("Short : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE) ;
		System.out.println("Integer : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE) ;
		System.out.println("Long : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE) ;
		
		//基本型態的浮點數
		float nts = 1000.323f ;
		double money = 100.999 ;
		System.out.println("Float : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE) ;
		System.out.println("Double : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE) ;
	
		//溢位(Overflow)會怎麼樣？
		byte height = 100 ;
		System.out.println(height);
		
		//基本型態的字元 https://zh.wikipedia.org/wiki/ASCII
		char a = 66 ;
		System.out.println(a);
		
		//基本型態的布林
		boolean flag = true ;
		
		//其他的型態為類別型態
		String str = "ABC" ;
		System.out.println(str);
	}
	
}
