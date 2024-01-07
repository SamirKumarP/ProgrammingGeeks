package hackerrank.datastructures;

import java.util.HashMap;
import java.util.Map;

public class HashTableRansom {
	
	public static boolean canBuildRandomNote(String[] magazine, String[] note) {
		HashMap<String, Integer> magazineFreq = getStringFrequency(magazine);
		HashMap<String, Integer> noteFreq = getStringFrequency(note);
		return hasEnoughStrings(magazineFreq, noteFreq);
	}

	private static boolean hasEnoughStrings(HashMap<String, Integer> magazineFreq, HashMap<String, Integer> noteFreq) {
		for (Map.Entry<String, Integer> entry: noteFreq.entrySet()) {
			String word = entry.getKey();
			if (!magazineFreq.containsKey(word) || magazineFreq.get(word) < entry.getValue()) {
				return false;
			}
		}
		return true;
	}

	private static HashMap<String, Integer> getStringFrequency(String[] text) {
//		maps from word to occurences
		HashMap<String, Integer> frequencies = new HashMap<String, Integer>();
		for (String word : text) {
//			 add to hashmap
			if(!frequencies.containsKey(word)) {
				frequencies.put(word, 0);
			}
//			increment occurence count
			frequencies.put(word, frequencies.get(word) + 1);
		}
		return frequencies;
	}

	public static void main(String[] args) {
//		String[] magazine = {"hello", "world", "blah", "hi"};
//		String[] note = {"hello", "world", "blah"};
		String[] magazine = {"hello", "world", "world", "hi"};
		String[] note = {"hello", "world", "world"};
		System.out.println(canBuildRandomNote(magazine, note));
	}

}
