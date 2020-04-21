// Program that tests the triangle exception
public class TestTriangleException {
	
	public static void main(String[] args) {
		
		try {
		Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
		System.out.println("Area of triangle 1: " + triangle1.area());
		
		Triangle triangle2 = new Triangle(1.0, 2.0, 5.0);
		System.out.println("Area of triangle 2: " + triangle2.area());
		
		} catch (IllegalTriangleException e) {
				System.out.println("Invalid triangle dimensions entered");
		}
	}	
}


