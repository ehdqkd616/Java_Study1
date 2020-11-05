package inheritance.good;

public class InheritanceExample {

	public static void main(String[] args) {
		Student s = new Student("김연우", 20, 2016);
		Teacher t = new Teacher("김연우", 20, "JAVA");
		Person p = new Person("김연우", 20);
		System.out.println(s.getDetails());
		System.out.println(t.getDetails());
		System.out.println(p.getDetails());
		Person[] perArray = new Person[3];
		perArray[0] = p;
		perArray[1] = s;
		perArray[2] = t;
		for(int i=0; i<perArray.length; i++) {
			System.out.println(perArray[i].getDetails());
		}
	}

}
