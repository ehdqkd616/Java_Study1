package collection_;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("123");
		System.out.println(set.add("123"));
		set.add("1");
		set.add("12");
		System.out.println(set.size());
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		for(String a : set) {
			System.out.println(a);
		}
	}
}
