// Program that converts ounces to grams.
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// Get value in ounces
		System.out.print("Enter a value in ounces:");
		double ounces = input.nextDouble();
		
		// Convert ounces to grams
		double grams = ounces * 28.3495;
		
		// Print result
		System.out.println(ounces + " ounces is " + grams + " grams.");

	}

}
