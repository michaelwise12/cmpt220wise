
public class Cylinder2 extends Shape {
	private double radius;
	private double height;
	
	public Cylinder2(double radius, double height) {
		super("Cylinder");
		this.radius = radius;
	}
	public double area() {
		return Math.PI  * radius * radius * height;
	}
	public String toString() {
		return super.toString() + "[radius = " + radius + ", height = " + height + "]";
	}
}
