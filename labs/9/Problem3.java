// Program that converts a binary string (ex. "5" = 0101) into decimal format and throws an exception if not in binary form
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a binary string: ");
		String binaryString = input.next();
		int decimal = bin2Dec(binaryString);
		System.out.println("Converted to decimal number: " + decimal);
		
	}
	
	public static int bin2Dec(String binaryString) throws NumberFormatException{
		int num = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			
			if (binaryString.charAt(i) == '1')
				num += 2;
			else if (binaryString.charAt(i) != '0')
				throw new NumberFormatException("The string is not a binary string.");
			num *= 2;
			
		}
		
		num /= 4;
		return num;

	}

}
