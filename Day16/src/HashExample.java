import java.util.*;

public class HashExample {

	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("김연우", 24));
		set.add(new Person("김연우", 24));
		System.out.println(set);
	
	}

}
