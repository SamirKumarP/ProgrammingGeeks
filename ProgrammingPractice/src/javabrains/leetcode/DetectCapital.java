package javabrains.leetcode;

import java.util.function.Predicate;

public class DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean detectCapitalUse(String word) {
		if (word.length() <= 1) return true;
		Predicate<Character> correctCase = Character::isLowerCase;
		if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
			correctCase = Character::isUpperCase;
		}
		for (int i = 1; i < word.length(); i++) {
			if (!correctCase.test(word.charAt(i))) return false;
		}
		return true;
	}

}
