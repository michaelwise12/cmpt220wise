// Program that finds # of evens, total sum, and average of an input series of positive integers
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// Create  input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive integer, the input will end with a 0:");
		int number = input.nextInt();
		
		int total = 0;
		int evenTotal = 0;
		int count = 0;
		
		// While that increments based off of certain conditional statements
		while (number != 0) {
			if (number % 2 == 0)
				evenTotal++;
			total = total + number;
			count++;
			number = input.nextInt();
				
		}
		double average = (double)total / (double)count;
		
		// Output the results
		System.out.println("The number of even numbers is: " + evenTotal);
		System.out.println("The total sum is: " + total);
		System.out.println("The average of all the numbers is: " + average);
	}

}
