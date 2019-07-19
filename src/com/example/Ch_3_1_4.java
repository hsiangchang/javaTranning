package com.example;

import java.util.HashMap;
import java.util.Map;

public class Ch_3_1_4 {

	public static void main(String[] args) {
		
		//型別轉換
		int a = 10 ;
		long b = 200 ;
		
		//int c = a + b;
		//System.out.println(c);
		
		System.out.println((long)a);
		
		
		Map map = new HashMap();
		map.put("a", a);
		System.out.println((Long)map.get("a"));
		
	}
	
}
