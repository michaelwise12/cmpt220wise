// Program that shows a table that shows inches and centimeter conversions
public class Problem1 {

	public static void main(String[] args) {
		System.out.println("in      cm | cm      in");
		System.out.print("-----------------------");
		
		// For loop that prints each line with i for inches and j for cm
		for (int i = 1, j = 1; i < 51; i++, j += 5) {
			System.out.printf("\n%2d ", i);
			System.out.printf("%7.2f", (i * 2.54));
			System.out.print(" | ");
			if (j < 100)
				System.out.printf("%2d ", j);
			else
				System.out.printf("%2d", j);
			System.out.printf("%7.2f", (j / 2.54));
		}

	}
	
}
