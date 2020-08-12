package collection_;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
	
//		TreeSet<String> set = new TreeSet<>();
//		set.add("가");
//		set.add("가나");
//		set.add("가나");
//		set.add("가나다");
//		set.add("나");
//		set.add("다라");
//		System.out.println(set);
		TreeSet<Person> pset = new TreeSet<>();
		pset.add(new Person("김연우",24));
		pset.add(new Person("신유섭",27));
		System.out.println(pset);
	}
}
