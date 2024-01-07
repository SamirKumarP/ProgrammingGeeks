package hackerrank.solutions.Java.exercise;

import java.util.List;
import java.util.stream.Stream;

public class LambdaExpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int getPopulation(List<Country> countries, String continent) {
		int sum = 0;
		for (Country c : countries) {
			if (c.getContinent().equals(continent)) {
				sum += c.getPopulation();
			}
		}
		return sum;
	}
	
	int getPopulationLambda(List<Country> countries, String continent) {
		/*
		 * Filter countries.
		 */
		Stream<Country> subList = countries.stream().filter(
				country -> { return country.getContinent().equals(continent);});
		/*
		 * Convert to list of populations.
		 */
		Stream<Integer> populations = subList.map(c -> c.getPopulation());
		/*
		 * Sum list.
		 */
		int population = populations.reduce(0, (a , b) -> a + b);
		return population;
	}
	
	int getPopulationLambdaOptimized(List<Country> countries, String continent) {
		Stream<Integer> populations = countries.stream().map(
				c -> c.getContinent().equals(continent) ? c.getPopulation() : 0);
		return populations.reduce(0, (a , b) -> a + b);
	}

}
