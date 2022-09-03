package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//Product [] array = new Product[7];
		List<Product> list = new ArrayList<Product>();
		
		//Input input = new Input(array);
		Input input = new Input(list);
		input.fileInput();
		
		Calc calc = new Calc(list);
		calc.calc();
		
		Sort sort = new Sort(list);
		sort.sort();
		
		Output output = new Output(list);
		//output.output();  //화면출력
		output.fileOutput();  //파일출력
		System.out.println("File Output Success.");
	}
}
