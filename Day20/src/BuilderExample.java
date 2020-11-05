
public class BuilderExample {

	public static void main(String[] args) {
		String a = "a";
		System.out.println(a.hashCode());
		a = a+"1234";
		System.out.println(a.hashCode());
		
		StringBuilder b = new StringBuilder("a");
		System.out.println(b.hashCode());
		b.append("1234");
		System.out.println(b);
		System.out.println(b.hashCode());
	}

}
