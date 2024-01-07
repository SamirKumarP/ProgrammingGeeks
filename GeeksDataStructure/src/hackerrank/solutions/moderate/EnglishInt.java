package hackerrank.solutions.moderate;

import java.util.LinkedList;

public class EnglishInt {

	public static void main(String[] args) {
		System.out.println(convert(1234));

	}
	
	static String[] smalls = {
			"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
			"Sixteen", "Seventeen", "Eighteen", "Nineteen"
	};
	static String[] tens = {
			"", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy",
			"Eighty", "Ninety"
	};
	static String[] bigs = {
			"", "Thousand", "Million", "Billion"
	};
	static String hundred = "Hundred";
	static String negative = "Negative";
	
	static String convert(int num) {
		if (num == 0) {
			return smalls[0];
		} else if (num < 0) {
			return negative + " " + convert (-1 * num);
		}
		LinkedList<String> parts = new LinkedList<String>();
		int chunkCount = 0;
		while (num > 0) {
			if (num % 1000 != 0) {
				String chunk = convertChunk(num % 1000) + " " + bigs[chunkCount];
				parts.addFirst(chunk);
			}
			num /= 1000; // shift chunk
			chunkCount ++;
		}
		return listToString(parts);
	}

	private static String convertChunk(int number) {
		LinkedList<String> parts = new LinkedList<String>();
		/*
		 * Convert hundreds place
		 */
		if (number >= 100) {
			parts.addLast(smalls[number / 100]);
			parts.addLast(hundred);
			number %= 100;
		}
		/*
		 * Convert tens place
		 */
		if (number >= 10 && number <= 19) {
			parts.addLast(smalls[number]);
		} else if (number >= 20) {
			parts.addLast(tens[number / 10]);
			number %= 10;
		}
		/*
		 * Convert ones place
		 */
		if (number >= 1 && number <= 9) {
			parts.addLast(smalls[number]);
		}
		return listToString(parts);
	}
	
	/*
	 * Convert a linked list of strings to a string, dividing it up with spaces.
	 */
	static String listToString(LinkedList<String> parts) {
		StringBuilder sb = new StringBuilder();
		while (parts.size() > 1) {
			sb.append(parts.pop());
			sb.append(" ");
		}
		sb.append(parts.pop());
		return sb.toString();
	}

}
