package miscGFG;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) { 
        Integer[] a = new Integer[]{1,2,3};
        Integer[] b = new Integer[]{4,5,6};
      
        Object[] c = concatenate(a,b); 
       
    System.out.println("Merged object array : "
                       + Arrays.toString(c)); 
    }
	
	// Function to merge two arrays of same type 
    public static <T> Object[] concatenate(T[] a, T[] b) 
    { 
        // Create an empty Object array of the combined 
        // size of the array a and array b 
        Object[] n=new Object[a.length + b.length]; 
          
        // Copy the array a into n 
        System.arraycopy(a, 0, n, 0, a.length); 
          
        // Copy the array b into n 
        System.arraycopy(b, 0, n, a.length, b.length); 
          
        return n; 
    }

}
