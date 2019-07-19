package com.example.Ch4_2_3.sample.core;

import com.example.Ch4_2_3.sample.ImportA;
import com.example.Ch4_2_3.sample.ImportB;

public class Factory {

	private Factory() {
		
	}
	
	public static BaseImport2 getImport(String type) {
		
		BaseImport2 impor = null ;
		
		if(type.equals("A")) {
			impor = new ImportA();
		} else if(type.equals("B")) {
			impor = new ImportB();
		}
		
		return impor;
	}
	
}
