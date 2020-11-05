package interface_;

public abstract class Ado implements A3,A4{

	public static void main(String[] args) {
	
		Ado a = new Ado();
		A3 a3 = a;
		A1 a1 = a3;
		A4 a4 = a;
		
	}

	@Override
	public void a1() {
		
	}
	@Override
	public void a2() {
		
	}

	@Override
	public void a3() {
		
	}

	@Override
	public void a4() {
		
	}
	
}
