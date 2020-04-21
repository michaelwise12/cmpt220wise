// Program that throws an exception with try-catch clause when element of array is out of bounds
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		int[] array = new int[100];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 100; i++) {
			array[i] = (int)(Math.random() * 100);
		}

		try {
			
			System.out.println("Enter an index of the array:");
			int index = input.nextInt();
			System.out.println("The element in that index is " + array[index]);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
		}
	}

}
