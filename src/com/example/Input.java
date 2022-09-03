package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Input {
	private List<Product> list;
	private File file;
	private Scanner sc;
	
	public Input(List<Product> list) {   //constructor  : member variable 초기화
		this.list = list;
		this.file = new File("./productdata.txt");
		try {
			this.sc = new Scanner(this.file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			return;
		}
	}
	
	public void fileInput() {
		while(this.sc.hasNextLine()) {
			String line = this.sc.nextLine();
			//System.out.println(line);    //NOTEBOOK	36000	5000	4700	2000
			/*
			 * String class split()
			 * Scanner class 
			 * StringTokenizer class
			 */
			Scanner myscan = new Scanner(line).useDelimiter("\\s+");
			String name = myscan.next();  //상품이름
			int su = myscan.nextInt();  //수량
			int selprice = myscan.nextInt();   //판매단가
			int buyprice = myscan.nextInt();   //매입단가
			int transport = myscan.nextInt();   //운송료
			Product p = new Product(name, su, selprice, buyprice, transport);
			this.list.add(p);
		}
	}
}