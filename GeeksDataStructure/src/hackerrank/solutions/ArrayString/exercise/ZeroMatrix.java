package hackerrank.solutions.ArrayString.exercise;

public class ZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	O(N) space
	void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
//		Store the row and column index with value 0
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
//		Nullify rows
		for (int i = 0; i < row.length; i++) {
			if (row[i]) nullifyRow(matrix, i);
		}
		
//		Nullify columns
		for (int j = 0; j < column.length; j++) {
			if (column[j]) nullifyColumn(matrix, j);
		}
	}
	void nullifyRow(int[][] matrix, int row) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}
		
	}
	private void nullifyColumn(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}
		
	}
	
//	O(1) space
	void setZeros2(int[][] matrix) {
		boolean rowHasZero = false;
		boolean colHasZero = false;
//		Check if first row has a zero
		for (int j = 0; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				rowHasZero = true;
				break;
			}
		}
//		Check if first column has a zero
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				colHasZero = true;
				break;
			}
		}
		
//		Check for zeros in the rest of the array
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
//		Nullify rows based on values in the first column
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				nullifyRow(matrix, i);
			}
		}
//		Nullify columns based on values in the first row
		for (int j = 1; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				nullifyColumn(matrix, j);
			}
		}
//		Nullify first row
		if (rowHasZero) {
			nullifyRow(matrix, 0);
		}
//		Nullify first column
		if (colHasZero) {
			nullifyColumn(matrix, 0);
		}
	}
}
