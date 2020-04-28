// Program that writes list of random integers to a file
import java.util.*;
import java.io.*;

public class Problem1 {

	public static void main(String[] args) throws IOException {
        File file = new File("Exercise10_1.txt");
        // Checks if file already exists in directory
        if (file.exists()) {
            System.out.println("Error: File already exists.");
            System.exit(1);
        }
        // Creates array of 100 random integers
	    int[] intArray = new int[100];
	    Random random = new Random();
	
	    for (int i = 0; i < intArray.length; i++) {
	        intArray[i] = random.nextInt(100) + 1;
	    }
	    
	    // Sorts the array, and then writes each value to the file to be read
	    PrintWriter output = new PrintWriter(file);
	    Arrays.sort(intArray);
	    for (int i : intArray) {
	        output.print(i + " ");
	    }
	    
	    output.close();
	
		}

}
