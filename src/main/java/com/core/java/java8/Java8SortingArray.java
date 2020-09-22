package com.core.java.java8;

import java.util.ArrayList;

public class Java8SortingArray {

	public static void main(String[] args) {

		ArrayList<Integer> arraysList = new ArrayList<Integer>();
		
		arraysList.add(1);
		arraysList.add(5);
		arraysList.add(4);
		arraysList.add(3);	
		arraysList.sort(Integer::compareTo); 
		
		System.out.println(arraysList);
		
	}

}
