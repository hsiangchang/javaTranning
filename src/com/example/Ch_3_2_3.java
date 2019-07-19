package com.example;

import java.util.ArrayList;
import java.util.List;

public class Ch_3_2_3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("A");
	
		for(String s : list) {
			System.out.println(s + " is " + list.indexOf(s));
		}
		
	}
	
	static int indexOf(List<String> list , String str) { 
		for(int i = 0 ; i < list.size() ; i ++) {
			if(list.get(i).equals(str)) {
				return i ;
			}
		}
		return -1 ;
	}
	
}
