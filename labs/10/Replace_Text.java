// Program that allows user to replace a specific string in a file and saves to original file
import java.io.*;
import java.util.*;

public class Replace_Text {
	 public static void main(String[] args) throws Exception {
		 // Check command-line parameter usage
		 if (args.length != 3) {
			 System.out.println(
					 "Usage: java Replace_Text file oldStr newStr");
			 System.exit(1);
		 }
		 // Check if the file exists
		 File file = new File(args[0]);
		 if (!file.exists()) { 
			 System.out.println("File " + args[0] + " does not exist");
			 System.exit(2);
			 }

		// Create a Scanner for input, replace all instances of that string in the file with new string
		ArrayList<String> strList = new ArrayList<>();
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			String s1 = input.nextLine();
			strList.add(s1.replaceAll(args[1], args[2]));
		}
		// Create a PrintWriter for output, write all the changes in list to original file
		PrintWriter output = new PrintWriter(file);
		for (int i = 0; i < strList.size(); i++) {
			output.println(strList.get(i));
		} 
		input.close();
		output.close();
	}
}
