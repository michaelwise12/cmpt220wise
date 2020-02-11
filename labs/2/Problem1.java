// Program that compares two numbers.
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// Get scanner input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number:");
		double num1 = input.nextDouble();
		System.out.print("Enter the second number:");
		double num2 = input.nextDouble();
		
		// Goes through every expression
		System.out.print(num1 + " is LESS THAN " + num2 + "? ");
		if (num1 < num2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		System.out.print(num1 + " is LESS THAN OR EQUAL TO " + num2 + "? ");
		if (num1 <= num2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		System.out.print(num1 + " is EQUAL TO " + num2 + "? ");
		if (num1 == num2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		System.out.print(num1 + " is NOT EQUAL TO " + num2 + "? ");
		if (num1 != num2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		System.out.print(num1 + " is GREATER THAN " + num2 + "? ");
		if (num1 > num2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		System.out.print(num1 + " is GREATER THAN OR EQUAL TO " + num2 + "? ");
		if (num1 >= num2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
