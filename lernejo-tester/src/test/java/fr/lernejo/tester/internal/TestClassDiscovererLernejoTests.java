package fr.lernejo.tester.internal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestClassDiscovererLernejoTests {

	@Test
	void listTestDiscoverer() {
		assertEquals(3, new TestClassDiscoverer("fr.lernejo.tester").testListClasses().size());
	}
}
