package com.core.java.puzzles;

public class ErrorHandling {

	public static void main(String[] args) {
		
	   try {
			
			System.out.println("Some logic");
			someBadMethod();
			
		}catch(Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println("Finally");
		}
	}
	
	
	static void someBadMethod(){
		
		throw new Error();
	}
}
