// Program that allows user to input and array and then sorts them in ascending order (SELECTION SORT)
import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] list = new double[100];
		
		// User can input up to 100 numbers
		int count = 0;
		System.out.println("Enter positive real numbers (0 to quit): ");
		for (int i = 0; i < 100; i++) {
			double number = input.nextDouble();
			if (number == 0)
				break;
			list[i] = number;
			// Keep a count so we can eliminate unnecessary elements later
			count++;
		}
		// Creates new array of proper size based on how many numbers user entered, sorts them, and prints
		list = Arrays.copyOfRange(list, 0, count);
		selectionSort(list);
		System.out.println(Arrays.toString(list));
		

	}
	// Same selection sort method as created in Problem #7
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

