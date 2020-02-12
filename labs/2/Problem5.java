// Program that compares two strings lexicographically and outputs them in ascending order.
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// Create scanner
		Scanner input = new Scanner(System.in);
		// Take input of two strings
		System.out.print("Enter your first string:");
		String str1 = input.nextLine();
		System.out.print("Enter your second string:");
		String str2 = input.nextLine();
		// Define output variable
		String result = "";
		
		// Compare str1 to str2 lexicographically
		int comparison = str1.compareTo(str2);
		
		// Sorts the strings to proper order
		if (comparison < 0) {
			result = str1 + " " + str2;			
		} else if (comparison == 0) {
			System.out.println("These strings are equivalent lexicographically.");
		} else {
			result = str2 + " " + str1;
		}
		// Prints the new sorted string
		System.out.println(result);
		
	}

}
