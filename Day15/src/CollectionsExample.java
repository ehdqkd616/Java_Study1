import java.util.*;

public class CollectionsExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=45; i++) {
			list.add(i);
		}
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		System.out.println(list.indexOf(40));
		Collections.sort(list);
		System.out.println(Collections.binarySearch(list, 40));
		String[] a = {"1", "2", "3", "4", "5"};
		List<String> b = Arrays.asList(a);
		System.out.println(b);
		System.out.println(b.indexOf("2"));
	}
}
