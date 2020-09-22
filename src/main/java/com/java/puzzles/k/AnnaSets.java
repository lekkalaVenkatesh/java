/*
 * https://jackho327.github.io/NOWHERE/interview/karat
 * 
 */


package com.java.puzzles.k;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AnnaSets {

	List<List<String>> getAnnaSets(String[] strings) {

		List<List<String>> annaSets = new ArrayList<>();

		if (strings == null || strings.length == 0) {

			return annaSets;
		}

		Map<String, List<String>> annaSetsMap = new LinkedHashMap<String, List<String>>();

		for (String string : strings) {

			char[] characters = string.toCharArray();
			Arrays.sort(characters);

			String sortedCharcters = new String(characters);

			if (annaSetsMap.containsKey(sortedCharcters)) {
				annaSetsMap.get(sortedCharcters).add(string);
			} else {
				annaSetsMap.put(sortedCharcters, new ArrayList<String>(Arrays.asList(string)));
			}

		}

		for (List<String> listStrings : annaSetsMap.values()) {

			if (listStrings.size() > 1) {

				annaSets.add(listStrings);

			}

		}

		return annaSets;

	}

}
