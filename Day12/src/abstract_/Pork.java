package abstract_;

public class Pork extends Meat implements Food {
	
	public Pork() {
		this.name = "돼지고기";
	}

	@Override
	public String getName() {
		return  this.name;
	}
	

}
