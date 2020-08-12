package collection_;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveOverlapExample {

	public static void main(String[] args) {				
		String[] a = {"가나", "가", "가", "가나", "가나다", "나가다", "나다가", 
					"나다가라", "나가다", "다나", "다"};
		String[] b = removeOverlap(a);
		System.out.println(Arrays.toString(b));
	}
	
	public static String[] removeOverlap(String[] dummy) {
		HashSet<String> data = new HashSet<>();
		for(String a : dummy) {
			data.add(a);
		}
		return data.toArray(new String[data.size()]);
	}

}
