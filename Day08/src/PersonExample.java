
public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "김연우";
		p1.age = 24;
		// == Person p1 = new Person("김연우", 24);
		
		Person p2 = new Person();
		p2.name = "신유섭";
		p2.age = 27;
		// == Person p2 = new Person("신유섭", 27);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.printf("이 사람의 이름은 %s, 나이는 %d 입니다.\n", p1.name,p1.age);
		System.out.printf("이 사람의 이름은 %s, 나이는 %d 입니다.\n", p2.name,p2.age);
	}
}
