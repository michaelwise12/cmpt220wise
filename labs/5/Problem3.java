// Program that sorts students grades in ascending order
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int studentNumber = input.nextInt();
		
		double[] scores = new double[studentNumber];
		String[] names = new String[studentNumber];
		for (int i = 0; i < studentNumber; i++) {
			System.out.print("Enter student " + (i + 1) + "'s first name, followed by their score: ");
			names[i] = input.next();
			scores[i] = input.nextDouble();
		}
		// Sorts both in ascending order according to score while keeping their parallel indices the same
		sort(scores, names);
		System.out.println();
		for (int i = 0; i < studentNumber; i++)
			System.out.println(names[i] + ": " + scores[i]);

	}
	// We can sort the scores and names in a parallel fashion by doing a selection sort of the scores
	// and as we find/replace minimum values we also switch the index of the name list too
	public static void sort(double[] scores, String[] names) {
		for (int i = 0; i < scores.length; i++) {
			double scoreMin = scores[i];
			String nameMin = names[i];
			int scoreMinIndex = i;
			for (int j = i + 1; j < scores.length; j++) {
				if (scoreMin > scores[j]) {
					scoreMin = scores[j];
					nameMin = names[j];
					scoreMinIndex = j;
				}
			}
			
			if (scoreMinIndex != i) {
				scores[scoreMinIndex] = scores[i];
				scores[i] = scoreMin;
				names[scoreMinIndex] = names[i];
				names[i] = nameMin;
			}
		}
	}

}
