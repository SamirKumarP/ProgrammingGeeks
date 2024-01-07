package hackerrank.algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class MiscProgramming {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		Iterate a map
		Map<String, Integer> iterMap = new HashMap<String, Integer>();
		iterMap.put("Samir", 1);
		iterMap.put("Paula", 2);
		iterMap.put("Jan", 3);
		for (Map.Entry<String, Integer> entry: iterMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			iterMap.containsKey(entry.getKey());
			iterMap.containsValue(entry.getValue());
		}
		Set<String> keySet = iterMap.keySet();
		iterMap.values();
		iterMap.remove("Samir");
		System.out.println(iterMap);
		
//		Convert set to list and vice versa
		List<String> targetList = new ArrayList<>(keySet);
		System.out.println(targetList + "targetList");
		Set<String> targetSet = new HashSet<>(targetList);
		System.out.println(targetSet + "targetSet");
		
//		Convert char array to String
		char[] charArray = new char[] {'c', 'a', 'b'};
		String charString = new String(charArray);
		System.out.println(charString);
		
//		Convert char to int
		int intValue = (int) 'a';
		System.out.println(intValue);
		
//		Convert String to StringBuilder
		String str = "abc";
		StringBuilder sBuilder = new StringBuilder(str);
		System.out.println(sBuilder);
		String strOriginal = new String(sBuilder);
		System.out.println(strOriginal);
		
//		Convert String to charArray
		char[] charArr = str.toCharArray();
		System.out.println(Arrays.toString(charArr));
		
//		List to array
		String[] array = {"abc", "def", "ghi"};
		List<String> arrayList = new ArrayList<String>(Arrays.asList(array));
		List<String> list = new ArrayList<String>(Arrays.asList("def", "abc", "ghi"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(Collections.binarySearch(list, "ghi"));
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		String[] arrayString = new String[list.size()];
		arrayString = list.toArray(arrayString);
		Arrays.fill(array, "1");
		System.out.println(Arrays.toString(array));
		
//		Arrays to list
		List<String> arryList = new ArrayList<String>(Arrays.asList(arrayString));
		
		List<String> arrayLinkedList = new LinkedList<String>(Arrays.asList(arrayString));
		String[] linkedListArray = new String[arrayLinkedList.size()];
		linkedListArray = arrayLinkedList.toArray(linkedListArray);
		
//		Declaring arrayList
		
//		Merge two arrays
		String[] array1 = {"abc", "def", "ghi"};
		String[] array2 = {"jkl", "mno", "pqr"};
		String[] array3 = new String[array1.length + array2.length];
		System.arraycopy(array1, 0, array3, 0, array1.length);
//		System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(array2, 0, array3, array1.length, array2.length);
		System.out.println(Arrays.toString(array3));
//		Clone Array
		String[] clonedArray = array3.clone();
		System.out.println(Arrays.toString(clonedArray));
		System.out.println(Arrays.toString(Arrays.copyOf(array3, 7)));
		
		
//		Populate char count to an array
		String stringCount = "billion";
		int[] charCounts = new int[26];
		for (int i = 0; i < stringCount.length(); i++) {
			char c = stringCount.charAt(i);
			int offset = (int) 'a';
			int code = c - offset;
			charCounts[code]++;
		}
		System.out.println(Arrays.toString(charCounts));
		
		
//		String comparison
		String literal1 = "abcde";
		String literal2 = "abcde";
		String stringObj1 = new String("abcde");
		String stringObj2 = new String("abcde");
		System.out.println(literal1 == literal2); // True
		System.out.println(literal1.equals(literal2)); // True
		System.out.println(literal1 == stringObj1);// False
		System.out.println(stringObj1 == stringObj2); // False
		System.out.println(stringObj1.equals(stringObj2)); // True
		System.out.println(literal1.equals(stringObj2)); // True
		
//		Sort array
		Arrays.sort(charArray);
		System.out.println(charArray);
		System.out.println(Arrays.binarySearch(charArray, 'a'));
		System.out.println(Arrays.binarySearch(charArray, 'd'));
		System.out.println(charArray.length);
//		Convert a list to an ArrayList
		
		int maxValue = Integer.MAX_VALUE;
		int minValue = Integer.MIN_VALUE;
		System.out.println(Math.max(maxValue, minValue));
		System.out.println(Math.min(maxValue, minValue));
		System.out.println(Math.abs(Arrays.binarySearch(charArray, 'd')));
		int x = -1;
		System.out.println(x);
		
//		sqrt
		int sqrt = (int)Math.sqrt(122);
		System.out.println(sqrt);
		int power = (int)Math.pow(sqrt, 2);
		System.out.println(power);
		
//		Random
		Random random = new Random();
		random.nextBoolean();
		random.nextInt();
		
//		Comparator
		String[] arrayAnagram = {"care", "acre", "new", "array", "race"};
		Arrays.sort(arrayAnagram, new Comparator<String>() {
			
			public String sortChars(String s) {
				char[] content = s.toCharArray();
				Arrays.sort(content);
				return new String(content);
			}
			
			@Override
			public int compare(String s1, String s2) {
				return sortChars(s1).compareTo(sortChars(s2));
			}
		});
		
//		Check array and list equality
		
		String[] arrayAnagram1 = {"care", "acre", "new", "array", "race"};
		String[] arrayAnagram2 = {"care", "acre", "new", "array", "race"};
		System.out.println(Arrays.equals(arrayAnagram1, arrayAnagram2));
		
		List<String> list1 = new ArrayList<String>(Arrays.asList("def", "abc", "ghi"));
		List<String> list2 = new ArrayList<String>(Arrays.asList("def", "abc", "ghi"));
		System.out.println(list1.equals(list2));
		Collections.reverse(list1);
		System.out.println(list1);
		System.out.println(Collections.binarySearch(list2, "ghi"));
		
//		Set operations
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(set.contains(1));
		System.out.println(set.size());
		set.remove(1);
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(2);
		set2.add(3);
		System.out.println(set.equals(set2) + " set equals test");
//		List operations
		list1.contains("ghi");
		
//		String operations
		String stringOp = new String("abccfg");
		System.out.println(stringOp.indexOf("cfg"));
		System.out.println(stringOp.substring(2));
		System.out.println(stringOp.substring(2, 4));
		System.out.println("abcbcbde".replace("bc", "yz"));
		StringBuilder builder = new StringBuilder("abcbcbde");
		System.out.println(builder.insert(4, "123"));
		System.out.println(builder.toString());
		
//		
		Character.isUpperCase('a');
		char character = 'a';
		Character charact = 'b';
		System.out.println(Character.toUpperCase(character));
		System.out.println(Character.toUpperCase(charact));
		String casesens = "xyz";
		System.out.println(casesens.toUpperCase());
		
		
//		
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String first = br.readLine();
//		String second = br.readLine();
		
//		Convert String to a primitive
		int primint = Integer.parseInt("123");
//		Convert a String to a wrapper
		Integer wrapperInt = Integer.valueOf("123");
//		Convert wrapper to a primitive
		Integer integer = new Integer(32);
		int primitiveInt = integer.intValue();
		
		
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//		below foreach does not work check why. bcoz compare behaviour with traditional
//		numbers.forEach(y -> {
//			y = y * 2;
//		});
		
		ArrayList<Integer> numbersAL = numbers.stream().map(y -> y * 2).collect(Collectors
                .toCollection(ArrayList::new));
//		numbers.replaceAll(y -> y * 2);
		System.out.println("numbers " + numbersAL);
	}
	
//	collections.removeIf(), Collections.reverseOrder()
//	list.remove
//	Character.isWhiteSpace
//	String.join
	
}
