package com.java.puzzles.k;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.core.java.puzzles.PathPattern;

public class PathPatternTest {

	private static PathPattern pathPattern;

	@BeforeAll
	static void initialize() {
		pathPattern = new PathPattern();
	}

	@Test
	void testIsValidMove() {

		String[] pathCoordinates = { "a1", "a2" , "b3" };
		
		for (int i = 0; i < pathCoordinates.length -1 ; i++) {

			String current = pathCoordinates[i];	
			String next = pathCoordinates[i+1];

			assertEquals(true, pathPattern.isValidMove(current, next));
		}

		
		
		String[] invalidPathCoordinates = { "a1", "b2" };

		assertEquals(false, pathPattern.isValidMove(invalidPathCoordinates[0], invalidPathCoordinates[1]));
		
	}

}
