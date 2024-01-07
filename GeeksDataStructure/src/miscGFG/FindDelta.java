package miscGFG;

public class FindDelta {
	
	public static void main(String[] args) { 
		int[] firstArray = {1, 5, 8, 7, 11};
		int[] otherArray = {7, 11, 1, 5, 8};
		StringBuilder doubleArray = new StringBuilder();
		StringBuilder  containedArray = new StringBuilder();
	      for (int i : firstArray) {
	    	  doubleArray.append(i);
	      }
	      doubleArray.append(doubleArray);
	      for (int i : otherArray) {
	    	  containedArray.append(i);
	      }
	      
	      System.out.println(doubleArray.indexOf(new String(containedArray)));
	}
}
