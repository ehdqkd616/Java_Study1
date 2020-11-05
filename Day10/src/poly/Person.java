package poly;

public class Person {
	
	public static void eat(Fruit fruit) {
		System.out.println("사람이 " +fruit.getName()+"을/를 먹습니다.");
	}

	public static void main(String[] args) {
		eat(new Apple());
		eat(new Banana());
		eat(new Melon());
		eat(new Grape());
	}
	
}
