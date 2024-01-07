package hackerrank.solutions.hard;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * Random number between lower and higher, inclusive
	 */
	int rand(int lower, int higher) {
		return lower + (int)(Math.random() * (higher - lower + 1));
	}
	int[] shuffleArrayRecursively(int[] cards, int i) {
		if (i == 0) return cards;
		shuffleArrayRecursively(cards, i - 1); // Shuffle earlier part
		int k = rand(0, i); // Pick random index to swap with
		/*
		 * Swap element k and i
		 */
		int temp = cards[k];
		cards[k] = cards[i];
		cards[i] = temp;
		/*
		 * Returned shuffled array
		 */
		return cards;
	}
	
	void shuffleArrayIteratively(int[] cards) {
		for (int i = 0; i < cards.length; i++) {
			int k = rand(0, i);
			int temp = cards[k];
			cards[k] = cards[i];
			cards[i] = temp;
		}
	}

}
