package com.core.java.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

	public void reflectionMethod() throws ClassNotFoundException, InstantiationException, IllegalAccessException,
			NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		Class classreflection = Class.forName("com.core.java.ReflectionExample.class");

		Object objInstance = classreflection.newInstance();

		Method method = classreflection.getMethod("reflectionMethod", null);

		method.invoke(objInstance);

	}

}
