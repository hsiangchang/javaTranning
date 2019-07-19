package com.example.Ch4_2_3.sample;

import com.example.Ch4_2_3.sample.core.BaseImport2;
import com.example.Ch4_2_3.sample.core.Factory;

public class Main {

	public static void main(String[] args) {
		
		String type = "A" ;
		BaseImport2 a = Factory.getImport(type) ;
		a.importFile();
		a.count();
		a.removeFirst();
		a.count();
		a.show();
		
	}
	
}
