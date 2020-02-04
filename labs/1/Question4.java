// Program that calculates the equation of special relativity.
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		final int speedoflight = 299972458;
		
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// Get input for mass
		System.out.print("Enter the mass in kilograms:");
		double mass = input.nextDouble();
		
		// Calculate energy
		double energy = mass * speedoflight * speedoflight;
		
		System.out.print("The energy in joules is: " + energy);
		
		
	}

}
