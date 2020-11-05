
public class Pen {
	
	public String color;
	public int price;

	public void write(String message) {
		System.out.println(message);		
	}
	
	public Pen() {
		
	}
	
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	public String toString() {
		return "Pen [Color=" + color + ", price=" + price + "]";
	}
}
