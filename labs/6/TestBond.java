
public class TestBond {

	public static void main(String[] args) {
		Bond bond1 = new Bond(500, 100, .05, 10000);
		
		System.out.printf("Bond price: $%.2f", bond1.getPrice());
	}

}
