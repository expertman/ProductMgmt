package com.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
	private List<Product> list;
	
	public Sort(List<Product> list) {
		this.list = list;
	}

	public void sort() {
		//Arrays.sort(this.array);
		Collections.sort(this.list, new Comparator<Product>() {

			@Override
			public int compare(Product front, Product back) {
				return (int)(back.getRate() - front.getRate());
			}
			
		});
	}
}







