import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("1", "김연우");
		map.put("1", "신유섭");
		map.put("2", "김루디");
		map.put("3", "김마늘");
		map.put("4", "신섭섭");
		map.put("5", "김섭팅");
		System.out.println(map.get("1"));
		Set<Map.Entry<String, String>> a = map.entrySet();
		for(Map.Entry<String, String> b : a) {
			System.out.printf("키값 : %s, 밸류값 : %s\n", b.getKey(), b.getValue());
		}
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.printf("키값 : %s, 밸류값 : %s\n", key,map.get(key));
		}
	}
}
