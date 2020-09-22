package com.core.java.puzzles;

public class PathPattern {

	public boolean processNodes(String[] pathCoordinates) {

		for (int i = 0; i < pathCoordinates.length - 1; i++) {

			String current = pathCoordinates[i];
			String next = pathCoordinates[i + 1];

			return isValidMove(current, next);
		}

		return false;
	}

	public boolean isValidMove(String currentNode, String nextNode) {

		char xFirstNode = currentNode.charAt(0);
		char yFirstNode = currentNode.charAt(1);

		char xSecondNode = nextNode.charAt(0);
		char ySecondNode = nextNode.charAt(1);

		if (xFirstNode == xSecondNode || yFirstNode == ySecondNode) {
			return true;
		}

		return false;

	}

}
