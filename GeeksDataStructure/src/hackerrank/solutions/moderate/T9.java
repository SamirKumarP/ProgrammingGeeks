package hackerrank.solutions.moderate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import hackerrank.codelibrary.AssortedMethods;
import hackerrank.codelibrary.HashMapList;
import hackerrank.codelibrary.Trie;
import hackerrank.codelibrary.TrieNode;

public class T9 {

	public static void main(String[] args) {
		ArrayList<String> words = getValidT9Words("8733", AssortedMethods.getTrieDictionary());
		for (String w: words) {
			System.out.println(w);
		}

	}
	
//	O(4^N)
	ArrayList<String> getValidT9Words(String number, HashSet<String> wordList) {
		ArrayList<String> results = new ArrayList<String>();
		getValidWords(number, 0, "", wordList, results);
		return results;
	}

	void getValidWords(String number, int index, String prefix, HashSet<String> wordSet,
			ArrayList<String> results) {
		/*
		 * If its a complete word print it.
		 */
		if (index == number.length() && wordSet.contains(prefix)) {
			results.add(prefix);
			return;
		}
		/*
		 * Get characters that match this digit.
		 */
		char digit = number.charAt(index);
		char[] letters = getT9Chars(digit);
		/*
		 * Go through all remaining options.
		 */
		if (letters != null) {
			for (char letter : letters) {
				getValidWords(number, index + 1, prefix + letter, wordSet, results);
			}
		}
		
	}

	/*
	 * Return array of characters that map to this digit.
	 */
	static char[] getT9Chars(char digit) {
		if (!Character.isDigit(digit)) {
			return null;
		}
		int dig = Character.getNumericValue(digit) - Character.getNumericValue('0');
		return t9Letters[dig];
	}
	
	/*
	 * Mapping of digits to letters
	 */
	static char[][] t9Letters = {null, null, {'a', 'b', 'c'}, {'d', 'e', 'f'},
			{'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},
			{'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}
			};
	
	
	static ArrayList<String> getValidT9Words(String number, Trie trie) {
		ArrayList<String> results = new ArrayList<String>();
		getValidWords(number, 0, "", trie.getRoot(), results);
		return results;
	}

	static void getValidWords(String number, int index, String prefix, TrieNode trieNode,
			ArrayList<String> results) {
		/*
		 * If it's a complete word, print it.
		 */
		if (index == number.length()) {
			if (trieNode.terminates()) { // Is complete word
				results.add(prefix);
			}
			return;
		}
		
		/*
		 * Get characters that match this digit
		 */
		char digit = number.charAt(index);
		char[] letters = getT9Chars(digit);
		/*
		 * Go through all remaining options.
		 */
		if (letters != null) {
			for (char letter : letters) {
				TrieNode child = trieNode.getChild(letter);
				/*
				 * If there are words that start with prefix + letter,
				 * then continue recursing.
				 */
				if (child != null) {
					getValidWords(number, index + 1, prefix + letter, child, results);
				}
			}
		}
		
	}
	
//	O(N) this is guess and wrong
	/*
	 * WORD LOOKUP
	 */
	ArrayList<String> getValidT9Words(String numbers,
			HashMapList<String, String> dictionary) {
		return dictionary.get(numbers);
	}
	/*
	 * PRECOMPUTATION
	 */
	/*
	 * Create a hash table that maps from a number to all words that have this
	 * numerical representation.
	 */
	HashMapList<String, String> initializeDictionary(String[] words) {
		/*
		 * Create a hash table that maps from a letter to the digit
		 */
		HashMap<Character, Character> letterToNumberMap = createLetterToNumberMap();
			/*
			 * Create word -> number map.
			 */
		HashMapList<String, String> wordsToNumbers = new HashMapList<String, String>();
		for (String word : words) {
			String numbers = convertToT9(word, letterToNumberMap);
			wordsToNumbers.put(numbers, word);
		}
		return wordsToNumbers;
	}

	/*
	 * Convert mapping of number -> letters into letter -> number
	 */
	HashMap<Character, Character> createLetterToNumberMap() {
		HashMap<Character, Character> letterToNumberMap =
				new HashMap<Character, Character>();
		for (int i = 0; i < t9Letters.length; i++) {
			char[] letters = t9Letters[i];
			if (letters != null) {
				for (char letter : letters) {
					char c = Character.forDigit(i, 10);
					letterToNumberMap.put(letter, c);
				}
			}
		}
		return letterToNumberMap;
	}

	/*
	 * Convert from a String to its T9
	 */
	String convertToT9(String word, HashMap<Character, Character> letterToNumberMap) {
		StringBuilder sb = new StringBuilder();
		for (char c : word.toCharArray()) {
			if (letterToNumberMap.containsKey(c)) {
				char digit = letterToNumberMap.get(c);
				sb.append(digit);
			}
		}
		return sb.toString();
	}
	
	/*
	 * HashMapList<String, Integer> is a HashMap that maps from Strings to
	 * ArryaList<Integer>.
	 */

}
