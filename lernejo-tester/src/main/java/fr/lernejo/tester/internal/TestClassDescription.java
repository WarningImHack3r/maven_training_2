package fr.lernejo.tester.internal;

import fr.lernejo.tester.api.TestMethod;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

public record TestClassDescription(Class<?> cls) {

	public List<Method> listTestMethods() {
		return Arrays.stream(cls.getDeclaredMethods())
			.filter(p -> p.getModifiers() == Modifier.PUBLIC // public
                   && p.getReturnType() == Void.TYPE // void
                   && p.getParameters().length == 0 // no param
                   && p.isAnnotationPresent(TestMethod.class) // TestMethod annotation
		).toList();
	}
}
