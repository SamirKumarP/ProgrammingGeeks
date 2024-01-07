package hackerrank.datastructures;

public class BalancedParentheses {

	public static void main(String[] args) {
		System.out.println(isBalanced("{}(){()}"));

	}
	
	public static char[][] TOKENS = {{'{', '}'}, {'[', ']'}, {'(', ')'}};
	public static boolean isBalanced(String expression) {
		java.util.Stack<Character> stack = new java.util.Stack<Character>();
		for (char c: expression.toCharArray()) {
			if (isOpenTerm(c)) {
				stack.push(c);
			} else {
				if (stack.isEmpty() || !matches(stack.pop(), c)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	private static boolean matches(char openTerm, char closeTerm) {
		for (char[] array: TOKENS) {
			if (array[0] == openTerm) {
				return array[1] == closeTerm;
			}
		}
		return false;
	}
	private static boolean isOpenTerm(char c) {
		for (char[] array: TOKENS) {
			if (array[0] == c) {
				return true;
			}
		}
		return false;
	}
	

}
