package generic_;

public class GenericExample {

	public static void main(String[] args) {
		Person<Character> p1 = new Person<>("김연우", 24, 'a');
		char a = p1.getA();
		Person<Integer> p2 = new Person<>("김연우", 24, 10);
		int b = p2.getA();
		System.out.println(a);
		System.out.println(b);
		System.out.println(p1);
		System.out.println(p2);
		int c = test(10);
		String d = test("10");
		System.out.println(c);
		System.out.println(d);
		System.out.printf("a",10,10,'c',3.5);
		
	}
	public static <T> T test(T t) {
		return t;
	}

}
