package hackerrank.solutions.moderate;

public class PatternMatching {

	public static void main(String[] args) {
		System.out.println(doesMatch2("aabab", "catcatgocatgo"));

	}
	
//	O(n^5)
	static boolean doesMatch(String pattern, String value) {
		if (pattern.length() == 0) return value.length() == 0;
		int size = value.length();
		for (int mainSize = 0; mainSize < size; mainSize++) {
			String main = value.substring(0, mainSize);
			for (int altStart = mainSize; altStart <= size; mainSize++) {
				for (int altEnd = altStart; altEnd <= size; altEnd++) {
					String alt = value.substring(altStart, altEnd);
					String cand = buildFromPattern(pattern, main, alt);
					if (cand.equals(value)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	private static String buildFromPattern(String pattern, String main, String alt) {
		StringBuffer sb = new StringBuffer();
		char first = pattern.charAt(0);
		for (char c: pattern.toCharArray()) {
			if (c == first) {
				sb.append(main);
			} else {
				sb.append(alt);
			}
		}
		return sb.toString();
	}
	
//	Optimized O(n^2)
	static boolean doesMatch2(String pattern, String value) {
		if (pattern.length() == 0) return value.length() == 0;
		char mainChar = pattern.charAt(0);
		char altChar = mainChar == 'a' ? 'b' : 'a';
		int size = value.length();
		int countOfMain = countOf(pattern, mainChar);
		int countOfAlt = pattern.length() - countOfMain;
		int firstAlt = pattern.indexOf(altChar);
		int maxMainSize = size / countOfMain;
		for (int mainSize = 0; mainSize <= maxMainSize; mainSize++) {
			int remainingLength = size - mainSize * countOfMain;
			String first = value.substring(0, mainSize);
			if (countOfAlt == 0 || remainingLength % countOfAlt == 0) {
				int altIndex = firstAlt * mainSize;
				int altSize = countOfAlt == 0 ? 0 : remainingLength / countOfAlt;
				String second = countOfAlt == 0 ? "" :
					value.substring(altIndex, altSize + altIndex);
				String cand = buildFromPattern(pattern, first, second);
				if (cand.equals(value)) {
					return true;
				}
			}
		}
		return false;
	}
	
	static int countOf(String pattern, char c) {
		int count = 0;
		for (int i = 0; i < pattern.length(); i++) {
			if (pattern.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

}
