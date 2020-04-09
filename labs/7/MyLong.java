
public class MyLong {
	long value;

	// Constructor that creates a MyLong object
	MyLong(long value){
		this.value = value;
	}
	// Getter method that returns the long value
	long getValue() {
		return this.value;
	}
	// Methods that return true if the value in this object is even, odd, or prime
	boolean isEven() {
		return value % 2 == 0;		
	}
	
	boolean isOdd() {
		return value % 2 != 0;
	}
	
	boolean isPrime() {
		for (long i = 2; i <= value / 2; i++)
			if (value % i == 0)
				return false;
		return true;
	}
	
	// Static methods that return true if the specified value is even, odd, or prime
	static boolean isEven(long value) {
		return value % 2 == 0;
	}
	
	static boolean isOdd(long value) {
		return value % 2 != 0;
	}
	
	static boolean isPrime(long value) {
		for (long i = 2; i <= value / 2; i++) 
			if (value % i == 0)
				return false;
		return true;
	}

	// Static methods that return true if the specified value in this object is even, odd, or prime
	static boolean isEven(MyLong value) {
		return value.getValue() % 2 == 0;
	}
	
	static boolean isOdd(MyLong value) {
		return value.getValue() % 2 != 0;
	}
	
	static boolean isPrime(MyLong value) {
		for (long i = 2; i <= value.getValue() / 2; i++)
			if (value.getValue() % i == 0)
				return false;
		return true;
	}
	
	// Methods that returns true if value in this object is equal to the specified value
	boolean equals(long value) {
		return this.value == value;
	}
	
	boolean equals(MyLong value) {
		return this.value == value.getValue();
	}
	
	// Method that converts array of numeric characters into a long value
	static long parseLong(char[] charArray) {
		long number = 0;
		for (int i = 0; i < charArray.length; i++) {
			number = (number * 10) + (charArray[i] - '0');
		}
		return number;
	}
	
	// Method that converts a string into a long value
	static long parseLong(String str) {
		long number = 0;
		for (int i = 0; i < str.length(); i++) {
			number = (number * 10) + (str.charAt(i) - '0');
		}
		return number;
	}
	
}
