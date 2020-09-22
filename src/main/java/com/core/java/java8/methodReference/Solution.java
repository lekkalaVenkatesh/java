package com.core.java.java8.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public static int solution(String p, String d, int s) {

		int count = 0;

		if (p != null && d != null) {

			String[] items = p.split(" ");
			System.out.println("items"+items);

			List<String> itemList = Arrays.asList(items);

			Map<String, List<Integer>> mapValues = new HashMap<String, List<Integer>>();

			for (String list : itemList) {

				String[] itemsInner = list.split(",");

				if (mapValues.containsKey(itemsInner[0])) {

					List<Integer> teempList = mapValues.get(itemsInner[0]);

					teempList.add(Integer.parseInt(itemsInner[1]));

					mapValues.put(itemsInner[0], teempList);

				} else {
					
					List<Integer> teempList = new ArrayList<Integer>();
					
					teempList.add(Integer.parseInt(itemsInner[1]));
					mapValues.put(itemsInner[0], teempList);
					
				}

			}
			
			System.out.println(mapValues);

			List<Integer> intervals = mapValues.get(d);

			if (intervals == null) {
				return count;
			} else {

				int interval = intervals.get(intervals.size() - 1);

				for (int i = 0; i <= interval; i = i + s) {

					count = intervals.contains(i) ? count : count + 1;
				}
			}

		}

		return count;

	}

	public static void main(String[] args) {

		String p = "a,0 a,10, a,20";
		String d = "a";
		int s = 5;

		System.out.println(solution(p, d, s));
	}
}
