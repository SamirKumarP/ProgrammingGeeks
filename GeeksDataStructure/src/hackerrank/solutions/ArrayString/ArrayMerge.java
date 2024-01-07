package hackerrank.solutions.ArrayString;

import java.util.ArrayList;
import java.util.Arrays;
// O(1)
public class ArrayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	ArrayList<String> merge(String[] words, String[] more) {
		ArrayList<String> sentence = new ArrayList<String>();
//		Arrays.asList(words).addAll(Arrays.asList(words)); // by me
		for (String w: words) sentence.add(w);
		for (String w: more) sentence.add(w);
		return sentence;
	}
}
