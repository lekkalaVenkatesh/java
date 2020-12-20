package com.java.puzzles.k;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DegreeOfArray {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(1);

		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		Map<Integer, Integer> left = new HashMap<Integer, Integer>();
		Map<Integer, Integer> right = new HashMap<Integer, Integer>();

		int degree = 0;

		for (int i = 0; i < arrayList.size(); i++) {

			int num = arrayList.get(i);

			if (!left.containsKey(num)) {
				left.put(num, i);
			}

			count.put(num, count.getOrDefault(num, 0) + 1);
			right.put(num, i);
			degree = Math.max(degree, count.get(num));
		}

		int length = arrayList.size();

		for (Entry<Integer, Integer> entryset : count.entrySet()) {

			if (degree == entryset.getValue()) {
				length = Math.min(length, right.get(entryset.getKey()) - left.get(entryset.getKey()) + 1);
			}

		}

		System.out.println(length);

	}

}
