// Program that calculates the average of a specific row in an inputted matrix
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row size of your matrix: ");
		int row = input.nextInt();
		System.out.print("Enter the column size of your matrix: ");
		int col = input.nextInt();
		// Input all the values of the matrix
		System.out.println("Enter the entries of the matrix (you will need to enter " + (row * col) + " values):");
		double[][] matrix = new double[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		// I took my printMatrix method from question #5 to print the matrix
		printMatrix(matrix, row, col);
		System.out.print("\nEnter the index of the row you want to find the average of:");
		int rowIndex = input.nextInt();
		double average = averageRow(matrix, rowIndex, col);
		System.out.println("The average of all the elements in that row is: " + average);
		

	}
	// Method that takes a row given its index and returns the average of all the entries in that row
	public static double averageRow(double[][] array, int row, int col) {
		int rowIndex = row;
		double total = 0.0;
		for (int i = 0; i < col; i++) {
			total += array[rowIndex][i];
		}
		double average = total / col;
		return average;
	}
	// Method that prints the matrix
	public static void printMatrix(double[][] matrix, int row, int col) {
		for (int i = 0; i < row; i++) {
			System.out.println();
			for(int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
	}
}
