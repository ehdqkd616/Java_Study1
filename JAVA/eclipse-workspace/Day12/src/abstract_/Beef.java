package abstract_;

public class Beef extends Meat implements Food {
	
	public Beef() {
		this.name = "소고기";
	}

	@Override
	public String getName() {
		return  this.name;
	}
	

}
