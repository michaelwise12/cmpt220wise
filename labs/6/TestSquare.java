
public class TestSquare {

	public static void main(String[] args) {
		Square square1 = new Square(40);
		Square square2 = new Square(35.9);
		
		System.out.println("Square 1\n----------");
		System.out.println("Width: " + square1.width + "\nArea: " + square1.getArea() +
				"\nPerimeter: " + square1.getPerimeter());
		System.out.println();
		
		System.out.println("Square 2\n----------");
		System.out.println("Width: " + square2.width + "\nArea: " + square2.getArea() +
				"\nPerimeter: " + square2.getPerimeter());

	}

}
