// Program that tells if a string is a palindrome or not
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// Create scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		// Prints based on returned boolean value of isPalindrome()
		if (isPalindrome(str))
			System.out.println("The string '" + str + "' is a palindrome.");
		else
			System.out.println("The string '" + str + "' is not a palindrome.");
	}
	
	// Method that reverses the string
	public static String reverse(String s) {
		String reversed = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		return reversed;
	}
	// Method that checks if the string is a palindrome or not
	public static boolean isPalindrome(String s) {
		boolean result = s.toLowerCase().contentEquals(reverse(s.toLowerCase()));
		
		if (result)
			return true;
		else
			return false;
	}
	
}
