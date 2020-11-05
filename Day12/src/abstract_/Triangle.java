package abstract_;

public class Triangle extends Shape {
	
	public Triangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	protected double getArea() {
		return x*y/2.0;
	}
	
}
