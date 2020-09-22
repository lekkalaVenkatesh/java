package com.core.java.puzzles;

public class StringType {

	public static void main(String[] args) {
		
		if("Scwifty" instanceof String) {
			System.out.println(" Instance of");
		}
		
//		if("Scwifty".getType(). String) {
//			System.out.println(" Instance of");
//		}
		
		
		if("Scwifty".getClass().getSimpleName() == "String") {
			System.out.println(" getSimpleName ");
		}
		
		
//		if("Scwifty".getClass().getSimpleName().equals(String)) {
//		System.out.println(" Instance of");
//	    }
//		
		System.out.println("Scwifty".getClass().getSimpleName());
		
	}
	
}
