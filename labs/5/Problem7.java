// Program that checks if a square matrix is upper triangular (row echelon form)
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the size of your square matrix? ");
		int size = input.nextInt();
		
		// Initializes values of matrix with user input
		System.out.println("Enter the values in the array(" + size * size + " entries): ");
		double[][] array = new double[size][size];
			for (int i = 0; i < array.length; i++)
				for (int j = 0; j < array.length; j++)
					array[i][j] = input.nextDouble();
			// Says whether matrix is upper triangular or not
			if (isUpperTriangular(array))
				System.out.println("This is an upper triangular matrix.");
			else 
				System.out.println("This is not an upper triangular matrix.");
	}
	// If the value = 0 at every entry where row index > column index, then returns true.
	public static boolean isUpperTriangular(double[][] array) {
		for (int i = 1; i < array.length; i++)
			for (int j = 0; j < i; j++)
				if (array[i][j] != 0)
					return false;
		return true;
	}
}
