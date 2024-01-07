package hackerrank.solutions.ArrayString;


public class StringConcat {
	
	public static void main(String[] args) {
		String[] words = {"Samir", "Kumar", "Padhi"};
		joinWords2(words);

	}
	
	// O(xn^2)
	static String joinWords(String[] words) {
		String sentence = "";
		for (String w: words) {
			sentence = sentence + w;
		}
		return sentence;
	}
	 
	static String joinWords2(String[] words) {
		StringBuilder sentence = new StringBuilder();
		for (String w: words) {
			sentence.append(w);
		}
		return sentence.toString();
	}

}
