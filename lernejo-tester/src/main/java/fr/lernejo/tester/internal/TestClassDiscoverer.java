package fr.lernejo.tester.internal;

import fr.lernejo.tester.api.TestMethod;
import org.jetbrains.annotations.NotNull;
import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public record TestClassDiscoverer(String packageName) {

	public @NotNull List<TestClassDescription> testListClasses() {
		ArrayList<TestClassDescription> list = new ArrayList<>();
		System.out.println("here");
		new Reflections(packageName, Scanners.SubTypes).getSubTypesOf(Object.class)
			.forEach(System.out::println)
			/*.stream()
			.filter(c -> !Arrays.stream(c.getDeclaredMethods())
				.filter(method -> method.isAnnotationPresent(TestMethod.class))
				.toList().isEmpty()
				             && c.getName().endsWith("LernejoTests"))
			.forEach(c -> list.add(new TestClassDescription(c)))*/;
		return list;
	}
}
