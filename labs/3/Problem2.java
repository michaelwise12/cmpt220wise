// Program that prints all the numbers from 100 to 500 (10 per line) that are divisible by 5 or 7 but not both
public class Problem2 {

	public static void main(String[] args) {
		// Initialize count
		int count = 0;
		
		// For loop that checks each # 100 - 500 whether they are divisible or not under conditions
		for (int i = 100; i < 500; i++) {
			if (i % 5 == 0 && i % 7 != 0 || i % 7 == 0 && i % 5 != 0 ) {
				if (count % 10 == 0 && count != 0)
					System.out.println("");
				System.out.print(i + " ");
				count++;
			}
		}
		
	}

}
