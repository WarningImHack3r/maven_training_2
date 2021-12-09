package fr.chose;

import org.jetbrains.annotations.NotNull;

import java.util.stream.IntStream;

public record Stats(int min,
                    int max,
                    int sum,
                    double avg) {

	public static @NotNull Stats of(int... numbers) {
		int sum = IntStream.of(numbers).sum();
		return new Stats(
			IntStream.of(numbers).min().orElse(0),
			IntStream.of(numbers).max().orElse(0),
			IntStream.of(numbers).sum(),
			IntStream.of(numbers).average().orElse(0));
	}
}
