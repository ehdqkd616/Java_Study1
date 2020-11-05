package inheritance.good;

public class EqualsExample {
	
	public static void main(String[] args) {
		Person p1 = new Person("김연우",24);
		Person p2 = new Person("김연우",24);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
	}
}
