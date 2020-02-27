// Program that generates array of 1000 random integers, calculates average and tells how many are above and below the average
public class Problem5 {

	public static void main(String[] args) {

		// Generates array of 1000 random integers between 1 and 1000
		int[] random = new int[1000];
		for (int i = 0; i < 1000; i++) {
			random[i] = (int)(Math.random() * 1000 + 1);	
		}
		// Calculates average
		int sum = 0;
		double average = 0.0;
		for (int i = 0; i < 1000; i++)  {
			sum += i;
		}
		average = sum / 1000;
		System.out.println("The average of 1000 random integers is: " + average);
		
		// Increments two counts whether is less or more than average
		int countLess = 0;
		int countGreater = 0;
		for (int i = 0; i < 1000; i++) {
			if (random[i] < average) 
				countLess++;
			else if (random[i] > average)
				countGreater++;
		}
		// Prints count of numbers less than average and greater than
		System.out.println("There are " + countLess + " numbers less than the average.");
		System.out.println("There are " + countGreater + " numbers greater than the average.");
		}

	}

