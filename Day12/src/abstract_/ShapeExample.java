package abstract_;

public class ShapeExample {

	public static void main(String[] args) {
		printArea(new Circle(5));
		printArea(new Triangle(10,3));
//		printArea(new Shape()); Shape는 추상적인 개념이기때문에 사용될 수 없음.
	}
	
	public static void printArea(Shape shape) {
		if(shape instanceof Circle) {
			System.out.println("원의 넓이는 "+shape.getArea());
		}else if(shape instanceof Triangle) {
			System.out.println("삼각형의 넓이는 "+shape.getArea());
		}
	}

}