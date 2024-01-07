package hackerrank.solutions.ArrayString.exercise;

/**
 * 
 * @author padhi
 * for i = 0 to n
 * temp = top[i];
 * top[i] = left[i]
 * left[i] = bottom[i]
 * bottom[i] = right[i]
 * right[i] = temp
 */
// O(N²)
public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	boolean rotate(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i]; // save top
				// left -> top
				matrix[first][i] = matrix[last - offset][first];
				// bottom -> left
				matrix[last - offset][first] = matrix[i][last];
				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
		return true;
	}

}
