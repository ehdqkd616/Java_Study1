package abstract_;

public class Melon extends Fruit implements Food {

	public String getName() {
		return name;
	}
	
	public Melon() {
		this.name = "멜론";
	}
	
}
