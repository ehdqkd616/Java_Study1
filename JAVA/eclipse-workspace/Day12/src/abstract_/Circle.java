package abstract_;

public class Circle extends Shape {
	
	public int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	@Override
	protected double getArea() {
		return r*r*Math.PI;
	}
	
}
