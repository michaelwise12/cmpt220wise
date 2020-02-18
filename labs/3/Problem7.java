// Program that prints the first 50 pentagonal numbers using methods
public class Problem7 {

	public static void main(String[] args) {
		
		int count = 0;
		
		// Loops and prints first 50 pentagonal numbers
		for (int i = 1; i < 51; i++) {
			if (count % 10 == 0 && count != 0)
				System.out.println();
			System.out.print(pentagonal(i) + " ");
			count++;
			
		}

	}
	// Method that calculates the nth pentagonal number
	public static int pentagonal(int n) {
		
		int result = ((3 * n * n) - n) / 2;
		return result;
	}
}
