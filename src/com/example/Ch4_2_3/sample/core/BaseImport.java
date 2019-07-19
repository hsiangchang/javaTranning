package com.example.Ch4_2_3.sample.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseImport {
	
	abstract protected String getFileName() ;
	
	private List<String> lines = new ArrayList<String>();

	public void importFile() {
		BufferedReader br = null;
		try {
			System.out.println("檔案名稱：" + getFileName());
			br = new BufferedReader(new FileReader(getFileName()));
			String line = null;
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public List<String> getLines() {
		return this.lines;
	}

	public void count() {
		System.out.println("資料筆數:" + lines.size());
	}
	
	public void show() {
		for(String line : lines) {
			System.out.println(line);
		}
	}
	
}
