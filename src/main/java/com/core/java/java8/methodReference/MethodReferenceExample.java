package com.core.java.java8.methodReference;

public class MethodReferenceExample {
	
    public MethodReferenceExample() {
		
		System.out.println("MethodReferenceExample Constructor called");
	}

	public MethodReferenceExample(String message) {
		
		System.out.println("MethodReferenceExample Constructor called");
	}

	public static void saySomething() {

		System.out.println("MethodReferenceExample::saySomething called");
	}

	public void saySomethingNonStatic() {

		System.out.println("MethodReferenceExample::saySomething called");
	}

	public static void main(String[] args) {

		Sayable sayable = MethodReferenceExample::saySomething;

		sayable.say();

		MethodReferenceExample methodReferenceExample = new MethodReferenceExample();

		Sayable sayableNonStatic = methodReferenceExample::saySomethingNonStatic;
		
		sayableNonStatic.say();
		
		SayableConstructor sayableConstructor = MethodReferenceExample::new;
		
		sayableConstructor.getMessage("Hello");
		
		
		String time = "13:55:29";
		
		System.out.println(time.subSequence(0, 5));

	}

}
