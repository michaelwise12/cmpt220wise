// Program that prints ASCII characters 1 to 100 (20 char per line)
public class Problem3 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for (int i = 1; i < 100; i++) {
			if (count % 20 == 0 && count != 0)
				System.out.println();
			System.out.print((char)i + " ");
			count++;
		}

	}

}
