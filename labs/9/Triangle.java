
public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;

	public Triangle(double s1, double s2, double s3) throws IllegalTriangleException{
		super("Triangle");
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
		
		// Checks if triangle inequality is satisfied
		if ((side1 >= side2 + side3) || (side2 >= side1 + side3) || (side3 >= side1 + side2))
			throw new IllegalTriangleException();
	}

	// Calculates area without needing the height
	// Heron's Formula - a way to get the area only needing to know the 3 side lengths
	public double area() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	
	public String toString() {
		return super.toString() + "[side 1 = " + side1 + ", side 2 = " + side2 + ", side 3 = " + side3 + "]";
	}
}
