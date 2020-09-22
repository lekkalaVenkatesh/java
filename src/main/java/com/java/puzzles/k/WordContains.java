/*
 * https://jackho327.github.io/NOWHERE/interview/karat
 * 
 */

package com.java.puzzles.k;

import java.util.HashMap;
import java.util.Map;

public class WordContains {

	boolean isFound(char[] letters, String search) {

		if (letters == null || letters.length == 0) {
			return false;
		}

		Map<Character, Integer> characterCounts = getCharCount(letters);

		Map<Character, Integer> searchCharacterCounts = getCharCount(search.toCharArray());

		for (Character character : searchCharacterCounts.keySet()) {

			if (!characterCounts.containsKey(character)) {

				return false;

			} else {

				Integer searchCount = searchCharacterCounts.get(character);
				Integer characterCount = characterCounts.get(character);
				if (searchCount > characterCount)
					return false;
			}
		}

		return true;

	}

	Map<Character, Integer> getCharCount(char[] chars) {

		Map<Character, Integer> characterCounts = new HashMap<Character, Integer>();

		for (Character letter : chars) {
			characterCounts.put(letter, characterCounts.getOrDefault(letter, 0) + 1);
		}

		return characterCounts;
	}

}
