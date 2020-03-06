// Program that takes two arrays by input and says if they're identical (order doesn't matter as long as contents are the same)
import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the values of the first array (first value will represent the # of elements): ");
		int arraySize = input.nextInt();
		int[] array1 = new int[arraySize + 1];
		
		array1[0] = arraySize;
		
		for (int i = 1; i < arraySize + 1; i++) {
			array1[i] = input.nextInt();
		}
		int[] array2 = new int[arraySize + 1];
		System.out.print("Enter the values of the second array (first value will represent the # of elements): ");
		for (int j = 0; j < arraySize + 1; j++) {
			array2[j] = input.nextInt();
		}
		
		if (equal(array1, array2))
			System.out.println("The two arrays are identical.");
		else
			System.out.println("The two arrays are not identical.");

	}
	
	public static boolean equal(int[] x, int[] y) {
		Arrays.sort(x);
		Arrays.sort(y);
		String array1str = Arrays.toString(x);
		String array2str = Arrays.toString(y);
		boolean result = array1str.contentEquals(array2str);
		return result;
		
		
	}

}
