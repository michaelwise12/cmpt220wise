// Program that generates a random phone number.
public class Problem6 {

	public static void main(String[] args) {
		
		System.out.println("Here's a random phone number (try not to be a creep and call them):");
		// Creates the area code (can't start with 0 or 1 so our lower limit is 200)
		double areacode = (Math.random() * (1000 - 200)) + 200;
		
		// Creates the number prefix
		double prefix = (Math.random() * (1000));
				
		// Creates the subscriber number (last four digits)
		double sub = (Math.random() * (10000));
		
		String areaString = "" + (int)areacode;
		String prefixString = "";
		String subString = "";
		
		// In case prefix double is less than 100, will add zeroes appropriately
		if (prefix < 10) {
			prefixString = "00" + (int)prefix;
		} else if (10 < prefix && prefix < 100) {
			prefixString = "0" + (int)prefix;
		} else {
			prefixString = prefixString + (int)prefix;
		}
		// In case subscriber number double is less than 1000, will add zeroes appropriately
		if (sub < 10) {
			subString = "000" + (int)sub;
		} else if (10 < sub && sub < 100) {
			subString = "00" + (int)sub;
		} else if (100 < sub && sub < 1000) {
			subString = "0" + (int)sub;
		} else {
			subString = "" + (int)sub;
		}

		// Output the formatted phone number
		System.out.println("(" + areaString + ")" + prefixString + "-" + subString);
	}

}
