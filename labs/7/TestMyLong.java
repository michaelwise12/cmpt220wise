
public class TestMyLong {

	public static void main(String[] args) {
		MyLong value = new MyLong(437);
		
		// Testing getting the value
		System.out.println(value.getValue());
		
		System.out.println("Testing static methods using the value 437:");
		System.out.println(value.isEven());
		System.out.println(value.isOdd());
		System.out.println(value.isPrime());
		
		System.out.println("Testing static methods using the value 36:");
		System.out.println(MyLong.isEven(36));
		System.out.println(MyLong.isOdd(36));
		System.out.println(MyLong.isPrime(36));
		
		System.out.println("Testing static methods with MyLong parameters using the value 103:");
		System.out.println(MyLong.isEven(new MyLong(103)));
		System.out.println(MyLong.isOdd(new MyLong(103)));
		System.out.println(MyLong.isPrime(new MyLong(103)));
		
		System.out.println(value.equals(437));
		System.out.println(value.equals(103));
	}

}
