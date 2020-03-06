// Program that calculates mean and standard deviation of list of doubles
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 doubles:");
		double[] array = new double[10];
		for (int i = 0; i < 10; i++) {
			array[i] = input.nextDouble();
		}
		// Call the methods to return mean and sd
		double mean = mean(array);
		double sd = deviation(array);
		System.out.println("The mean of those 10 numbers is: " + mean);
		System.out.println("The standard deviation of those 10 numbers is: " + sd);

	}
	// Method that calculates the mean of an array of doubles
	public static double mean(double[] x) {
		double total = 0;
		for (int i = 0; i < 10; i++) {
			total += x[i];
		}
		double mean = total/10;
		return mean;
	}
	// Method that calculates the standard deviation of an array of double
	public static double deviation(double[] x) {
		double total = 0;
		double mean = mean(x);
		double sd = 0;
		for (int i = 0; i < 10; i++) {
			total += Math.pow((x[i] - mean), 2);
		}
		sd = Math.sqrt(total/9);
		return sd;
	}
}
