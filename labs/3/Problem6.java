// Program that counts the number of vowels in a string using methods
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		str = str.toLowerCase();
		
		int count = vowelCount(str);
		System.out.println("This string has " + count + " vowels.");

	}
	public static int vowelCount(String str) {
		
		int vowelCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
					str.charAt(i) == 'o' || str.charAt(i) == 'u')
				vowelCount++;
		}
		return vowelCount;
	}
}
