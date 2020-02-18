// Program that finds the average of 3 numbers using methods
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// Create scanner for input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers and I will give you the average:");
		
		// Assigns value returned by average() function to result variable
		double result = average(input.nextDouble(), input.nextDouble(), input.nextDouble());
		
		System.out.println("The average of these numbers is " + result + ".");
		

	}
	// Method that calculates the average of three numbers
	public static double average(double a, double b, double c) {
		
		double average = ((a * 1.0) + (b * 1.0) + (c * 1.0)) / 3.0;
		return average;
	}
}
