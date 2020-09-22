package com.java.puzzles.k;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.java.puzzles.k.AnnaSets;

public class AnnaSetsTest {

	private static AnnaSets annaSets;

	@BeforeAll
	static void initialize() {

		annaSets = new AnnaSets();
	}

	@Test
	void method() {

		String[] strings = { "LOOPED", "ALLERGY", "GALLERY", "LARGELY", "POODLE", "CARROT" };

		List<List<String>> annaSetsWords = annaSets.getAnnaSets(strings);

		List<List<String>> mockedannaSetsWords = new ArrayList<List<String>>();

		String[] firstStrings = { "LOOPED", "POODLE" };

		mockedannaSetsWords.add(new ArrayList<String>(Arrays.asList(firstStrings)));

		String[] secondStrings = { "ALLERGY", "GALLERY", "LARGELY" };

		mockedannaSetsWords.add(new ArrayList<String>(Arrays.asList(secondStrings)));

		Arrays.asList(secondStrings);

		assertEquals(mockedannaSetsWords, annaSetsWords);

	}

}
