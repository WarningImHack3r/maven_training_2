package fr.lernejo.tester.internal;

import fr.lernejo.tester.SomeLernejoTests;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestClassDescriptionLernejoTests {

	@Test
	void listTestMethods() throws NoSuchMethodException {
		ArrayList<Method> testList = new ArrayList<>();
		testList.add(SomeLernejoTests.class.getDeclaredMethod("ok"));
		testList.add(SomeLernejoTests.class.getDeclaredMethod("ko"));

		assertEquals(testList, new TestClassDescription(SomeLernejoTests.class).listTestMethods());
	}
}
