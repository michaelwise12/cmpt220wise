
public class Square {

	double width = 1.0;
	
	public Square() {}
	
	Square(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return width * width;
	}
	
	public double getPerimeter() {
		return width * 4;
	}
}
