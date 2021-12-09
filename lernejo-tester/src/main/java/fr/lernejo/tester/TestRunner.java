package fr.lernejo.tester;

import fr.lernejo.tester.internal.TestClassDiscoverer;

public class TestRunner {
	public static void main(String[] args) {
		if (args != null && args.length > 0) {
			for (String pkg : args){
				new TestClassDiscoverer(pkg).testListClasses().forEach(System.out::println);
			}
		}
	}
}
