package abstract_;

public class Apple extends Fruit implements Food {
	
	public String getName() {
		return name;
	}
	
	public Apple() {
		this.name = "사과";
	}
	
}
