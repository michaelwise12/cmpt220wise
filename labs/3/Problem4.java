// Program that prints the largest prime number between 1 and 15,000
public class Problem4 {

	public static void main(String[] args) {
		
		int count = 0;
		
		// Searches backwards from 15000 and breaks once it finds a number that is prime
		for (int n = 15000; n > 1; n--) {
			if (isPrime(n)) {
				System.out.println(n + " is the largest number between 1 and 15,000.");
				break;
			}
			
		}
	}
	// Method that checks if a number is prime or not
	public static boolean isPrime(int num) {
		
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				prime = false;
		}
		return prime;
	}
	
}

