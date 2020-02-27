// Program that is able to insert integers into arrays and append them using methods
import java.util.Arrays;

public class Problem6 {

	public static void main(String[] args) {
		int[] list = {};
		
		// Prints each instance of adding i + 1 to end of array
		for (int i = 1; i < 11; i++) {
			list = addtoArray(list, i);
			System.out.println(Arrays.toString(list));
		}
		
		// Assigns the new list with inserted number and prints it
		list = insertNumber(list, 10, 3);
		System.out.println("Inserting '10' into position 3: " + Arrays.toString(list));
		
		list = insertNumber(list, 100, 7);
		System.out.println("Inserting '100' into position 7: " + Arrays.toString(list));
	}

	// Method that increases length of array by one and returns new array
	private static int[] addtoArray(int[] list, int integer) {
		list = Arrays.copyOf(list, list.length + 1);
		list[list.length - 1] = integer;
		return list;
	}
	
	// Method that inserts an integer into a given position of an array
	private static int[] insertNumber(int[] list, int integer, int index) {
		// We need arrays that can represent a copy of the list before and after the position of insertion
		int[] copyBefore = {};
		int[] copyAfter = {};
		int[] newList = {};
		
		copyBefore = Arrays.copyOfRange(list, 0, index);
		copyBefore = addtoArray(copyBefore, integer);
		copyAfter = Arrays.copyOfRange(list, index, list.length);

		for (int i = 0; i < copyBefore.length; i++) {
			newList = addtoArray(newList, copyBefore[i]);
		}
		for (int j = 0; j < copyAfter.length; j++) {
			newList = addtoArray(newList, copyAfter[j]);
		}
		
		return newList;
	}
}
