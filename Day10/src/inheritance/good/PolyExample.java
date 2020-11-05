package inheritance.good;

public class PolyExample {

	public static void main(String[] args) {
		System.out.println(new Person("김연우",24));
	}
	
	public static void println(Object obj) {
		System.out.println(obj.toString());
	}

}