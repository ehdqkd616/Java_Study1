package abstract_;

public class Grape extends Fruit implements Food {
	
	public String getName() {
		return name;
	}
	
	public Grape() {
		this.name = "포도";
	}
	
}
