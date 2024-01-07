package miscGFG;

public class StringSubstringTest {

	public static void main(String[] args) {
		boolean	isTrue = subString(8, 3, "ahgfklww", "alw");
		System.out.println(isTrue);
	}

	private static boolean subString(int i, int j, String string, String string2) {
		int counterSmall = 0;
		int counterLarge = 0;
		StringBuilder builder = new StringBuilder();
		while(i != 0 && j != 0) {
			if(string.charAt(counterLarge) == string2.charAt(counterSmall)) {
				builder.append(string.charAt(counterLarge));
				i --;
				j --;
				counterSmall ++;
				counterLarge ++;
			} else {
				i --;
				counterLarge ++;
			}
		}
		if(string2.equals(new String(builder))) {
			return true;
		}
		return false;
	}

}
