package abstract_;

public class Chicken extends Meat implements Food {
	
	public Chicken() {
		this.name = "닭고기";
	}

	@Override
	public String getName() {
		return  this.name;
	}
	

}
