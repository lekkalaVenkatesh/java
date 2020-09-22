package com.java.puzzles.k;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.java.puzzles.k.WordContains;

public class WordContainsTest {

	private static WordContains wordContains;

	@BeforeAll
	static void initialize() {
		wordContains = new WordContains();
	}

	@Test
	void testWordContain() {

		char[] letters = { 'B', 'Z', 'A', 'E', 'Z', 'D' };

		assertEquals(true, wordContains.isFound(letters, "BEZ"));
		assertEquals(true, wordContains.isFound(letters, "ZZ"));
		assertEquals(false, wordContains.isFound(letters, "ZZZ"));

	}

}
