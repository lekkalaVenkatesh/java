package com.core.java.puzzles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingWays {

	public static void main(String[] args) {

		ArrayList<String> listNames = new ArrayList<String>();

		listNames.add("A");
		listNames.add("C");
		listNames.add("B");

		System.out.println(listNames);

		// listNames.sort(List.Descesnding);

//		listNames.sort(Comparator.comparing(String::toString));
//		
//		Collections.sort(listNames);

		listNames.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());

		System.out.println(listNames);

	}
}
