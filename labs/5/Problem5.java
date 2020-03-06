// Program that transposes a square matrix (hey, this is actually quite useful for my linear algebra class, thanks Prof. Arias)
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of your square matrix: ");
		int size = input.nextInt();
		
		// Creating the matrix
		System.out.println("Enter the entries of your " + size + "x" + size + " matrix:");
		int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		// Print both matrices
		printMatrix(matrix, size);
		int[][] transMatrix = transpose(matrix, size);
		System.out.println("\n\nTransposed:");
		printMatrix(transMatrix, size);
	}
	// Method that prints a matrix of integers
	public static void printMatrix(int[][] matrix, int size) {
		for (int i = 0; i < size; i++) {
			System.out.println();
			for(int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
	}
	// Method that transposes the matrix by simply switching the rows and columns
	public static int[][] transpose(int[][] matrix, int size) {
		int[][] transMatrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				transMatrix[i][j] = matrix[j][i];
			}
		}
		return transMatrix;
	}

}
