package leetcode;

import java.util.Arrays;

public class MiscLambda {
	
	 public static void main(String[] args)
	    {
		 
		 String input = "1 2 3 4 5";
		 String[] splits = input.split(" ");
		 int[] result =  Arrays.stream(splits).mapToInt(Integer::parseInt).toArray();
	    }

}
