package static_;

public class MyConnection {
	
	private static MyConnection c = new MyConnection();
	
	private MyConnection() {
		
	}
	
	public static MyConnection getMyConnection() {
		return c;
	}
	
}
