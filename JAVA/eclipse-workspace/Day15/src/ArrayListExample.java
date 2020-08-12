
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("가나"); list.add("123");
		list.add("가나다"); list.add("가나다");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.indexOf("가나다"));
		System.out.println(list.lastIndexOf("가나다"));
		System.out.println(list.contains("가나다"));
		list.add(1, "12");
		System.out.println(list);
		System.out.println(list.set(1, "가"));
		System.out.println(list);
		list.remove("가나");
		System.out.println(list);
		System.out.println(list.remove(1));
		System.out.println(list);
		for(String a : list) {
			System.out.println(list);
		}
	}

}
