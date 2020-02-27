// Program that takes a string and counts occurrences of each character (except for special characters & spaces)
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		// Creates new array for the characters of the string
		char charList[] = new char[str.length()];
		
		// Removes every character in the string that is a special character (only numbers/letters)
		str = str.replaceAll("[^a-z A-Z 0-9]", "");
		
		// Initializes elements of the array with characters of new string
		for (int i = 0; i < str.length(); i++) {
			charList[i] = str.charAt(i);
		}
		
		// For characters 0-Z, check if it appears in charList array, if so, add to count
		for (char c = 48; c <= 122; c++) {
			int count = 0;
			for (char ch : charList) {
				if (c == ch) 
					count++;
			} if (count != 0)
				System.out.println("# of occurences of '" + (char)c + "': " + count);
		}

		
	}

}
