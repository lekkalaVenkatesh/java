package com.java.puzzles.k;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.java.puzzles.k.ParentChild;

public class ParentChildTest {

	private static ParentChild parentChild;

	@BeforeAll
	static void initilaize() {
		parentChild = new ParentChild();
	}
	
	@Test
	public void testGetIndividualsWithZeroParents() {
		
		String[] parentChildPairs = {"1,3","2,3","3,6","5,6",
			    "5,7","4,5","4,8","4,9","9,11"};
		
		parentChild.getParent(parentChildPairs);
	}
	
	
//	https://www.glassdoor.de/Vorstellungsgespr%C3%A4ch/Karat-Fragen-im-Vorstellungsgespr%C3%A4ch-E1286154.htm?countryRedirect=true

}
