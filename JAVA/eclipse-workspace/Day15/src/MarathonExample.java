import java.util.*;

public class MarathonExample {

	public static void main(String[] args) {
		String[] part = {"mislav", "ana", "mislav", "stanko"};
		String[] comp = {"mislav", "ana", "stanko"};
		System.out.println(solution(part,comp));
	}
	
	public static String solution(String[] participant, String[] completion) {
		HashMap<String,Integer> map = new HashMap<>();
		for(String part : participant) {
			map.put(part, map.getOrDefault(part,0)+1);
				
		}
		System.out.println(map);
		for(String com : completion) {
			map.put(com, map.get(com)-1);
		}
		System.out.println(map);
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			if(map.get(key)==1) {
				return key;
			}
		}
		
		return null;
			
	}
		
}
