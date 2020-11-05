package abstract_;

public class Person {
	
	public static void eat(Food food) {
		System.out.println("사람이 " +food.getName()+"을/를 먹습니다.");
	}

	public static void main(String[] args) {
		eat(new Apple());
		eat(new Banana());
		eat(new Melon());
		eat(new Grape());
		eat(new Beef());
		eat(new Pork());
		eat(new Chicken());
		
		
//		eat(new Fruit()); Fruit란 개념 자체임. 사용될 수 없음.
		
	}
	
}
