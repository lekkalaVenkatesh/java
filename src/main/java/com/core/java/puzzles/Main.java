package com.core.java.puzzles;

public class Main {

	public static void main(String[] args) {

		System.out.println(print(1));

	}

	static Exception print(int i) {

		if (i > 0) {

			return new Exception();

		} else {

			return new RuntimeException();
		}

	}

}
