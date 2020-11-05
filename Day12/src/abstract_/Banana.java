package abstract_;

public class Banana extends Fruit implements Food {
	
	public String getName() {
		return name;
	}
	
	public Banana() {
		this.name = "바나나";
	}
	
}
