// Program that generates three random integers given lower and upper limits.
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// Get scanner input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the lower limit integer:");
		int num1 = input.nextInt();
		System.out.print("Enter the upper limit integer:");
		int num2 = input.nextInt();

		int randomint1 = (int)(Math.random() * (num2 - num1)) + num1;
		int randomint2 = (int)(Math.random() * (num2 - num1)) + num1;
		int randomint3 = (int)(Math.random() * (num2 - num1)) + num1;
		
		// Outputs the three random integers:
		System.out.println("First random integer between " + num1 + " and " + num2 + ": " + randomint1);
		System.out.println("Second random integer between " + num1 + " and " + num2 + ": " + randomint2);
		System.out.println("Third random integer between " + num1 + " and " + num2 + ": " + randomint3);
		
		
		
	}

}
