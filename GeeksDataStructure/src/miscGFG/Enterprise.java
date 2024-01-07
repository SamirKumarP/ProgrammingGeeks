package miscGFG;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Enterprise {
    public static void main(String args[] ) throws Exception {
        String inputData = "";
        String thisLine = null;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        while ((thisLine = br.readLine()) != null) {
//            inputData += thisLine + "\n";
//        }
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println();
        String input = scanner.nextLine();
        int number = scanner.nextInt();
        System.out.println(input);
        System.out.println(number);
        // Output the solution to the console
        System.out.println(codeHere(inputData));
        
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
  
        Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.asList(arr));
    }
    public static String codeHere(String inputData) {
        // Use this function to write your solution;
        return inputData;
    }
}
