// Program that finds the maximum value in an array of doubles given user input
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 doubles:");
		double[] array = new double[10];
		for (int i = 0; i < 10; i++) {
			array[i] = input.nextDouble();
		}
		
		double max = max(array);
		System.out.println("The maximum value is " + max);
	

	}
	public static double max(double[] array) {
		double maxValue = array[0];
		for (int i = 0; i < 10; i++) {
			if (array[i] >= maxValue)
					maxValue = array[i];
		}
		return maxValue;
	}
}
