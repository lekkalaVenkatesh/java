package com.java.puzzles.k;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ParentChild {

	void getParent(String[] parentChildPairs) {

		Map<String, Integer> parentMap = new HashMap<String, Integer>();
		Map<String, Integer> childMap = new LinkedHashMap<String, Integer>();

		for (String parentChildPair : parentChildPairs) {

			String[] splitCharacters = parentChildPair.split(",");

			String parent = splitCharacters[0];
			String child = splitCharacters[1];

			parentMap.put(parent, parentMap.getOrDefault(parent, 0) + 1);
			childMap.put(child, childMap.getOrDefault(child, 0) + 1);
		}

		List<String> individualsWithZeroParents = new ArrayList<String>();

		for (String parent : parentMap.keySet()) {

			if (childMap.containsKey(parent)) {
				continue;
			} else {
				individualsWithZeroParents.add(parent);

			}

		}

		System.out.println(individualsWithZeroParents);

		List<String> individualsWithExactOneParent = new ArrayList<String>();

		for (Entry<String, Integer> child : childMap.entrySet()) {

			if (child.getValue() == 1) {

				individualsWithExactOneParent.add(child.getKey());

			}
		}

		
		
		
		System.out.println(individualsWithExactOneParent
				.stream()
				.sorted()
				.collect(Collectors.toList()));
		
		
		Collections.sort(individualsWithExactOneParent);
		System.out.println(individualsWithExactOneParent);

	}

}
