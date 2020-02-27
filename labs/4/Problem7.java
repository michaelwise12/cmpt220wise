// Program that removes duplicate values from an inputed array
import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Generates an array of the length n inputed by user
		System.out.print("Enter your desired length of the array:");
		int length = input.nextInt();
		double[] list = new double[length];
		
		// Assigns each element of array to what user inputs
		System.out.println("Enter " + length + " numbers: ");
		for (int i = 0; i < length; i++) {
			list[i] = input.nextDouble();
		}
		// Print the original array
		System.out.println(Arrays.toString(list));
		
		// Use selection sort to list values from smallest to largest
		System.out.println("Sorting your array into ascending order...");
		selectionSort(list);
		System.out.println(Arrays.toString(list));
		
		// Removes duplicate values using method
		System.out.println("Removing duplicates...");
		list = removeDuplicate(list);
		System.out.println(Arrays.toString(list));
		
}
	// Method that removes duplicate values of given array
	private static double[] removeDuplicate(double[] list) {
		double[] temp = new double[list.length];
		int duplicates = 0;
		int index = 0;
		
		for (int i = 0; i < list.length - 1; i++) {
			double j = list[i];
			if (j != list[i + 1]) 
				temp[index++] = j;
			else
				duplicates++;
		}
		
		temp[index++] = list[list.length - 1];
		temp = Arrays.copyOfRange(temp, 0, list.length - duplicates);
		return temp;
		
	}
	// We can do a selection sort to order the array values from smallest to largest
	// so we can check for duplicates in the removeDuplicate method.
	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				
				if (list[j] < list[minIndex])
					minIndex = j;
			}
			
			// Swap the element found as the minimum with the first element
			double temp = list[minIndex];
			list[minIndex] = list[i];
			list[i] = temp;
		}
	}
}
