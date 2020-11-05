package static_;

public class MyConnectionExample {

	public static void main(String[] args) {
		MyConnection con = MyConnection.getMyConnection();
		MyConnection con2 = MyConnection.getMyConnection();
		System.out.println(con);
		System.out.println(con2);
		System.out.println(con==con2);
	}

}
