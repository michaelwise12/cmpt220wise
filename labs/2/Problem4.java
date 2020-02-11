// Takes two characters and casts them as integers and takes their sum.
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input two characters.
		System.out.print("Enter first character:");
		int char1 = input.next().charAt(0);
		System.out.print("Enter second character:");
		int char2 = input.next().charAt(0);	
		
		// Casts the result as an integer of their sum.
		int result = char1 + char2;
		System.out.println(result);

	}

}
