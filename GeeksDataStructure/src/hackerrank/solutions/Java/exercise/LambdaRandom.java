package hackerrank.solutions.Java.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaRandom {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		List<Integer> list2 = Arrays.asList(1, 2, 3);
	}
	
	static List<Integer> getRandomSubset(List<Integer> list) {
		List<Integer> subset = new ArrayList<Integer>();
		Random random = new Random();
		for (int item : list) {
			/*
			 * Flip coin.
			 */
			if (random.nextBoolean()) {
				subset.add(item);
			}
		}
		return subset;
	}
	
	static List<Integer> getRandomSubsetLambda(List<Integer> list) {
		Random random = new Random();
		List<Integer> subset = list.stream().filter(
				k -> {
					/*
					 * Flip coin.
					 */
					return random.nextBoolean();
				}).collect(Collectors.toList());
				return subset;
	}
	
	static Random random = new Random();
	static Predicate<Object> flipCoin = o -> {
		return random.nextBoolean();
	};
	
	static List<Integer> getRandomSubsetLambdaPredicate(List<Integer> list) {
		List<Integer> subset = list.stream().filter(flipCoin).
			collect(Collectors.toList());
		return subset;
	}

}
