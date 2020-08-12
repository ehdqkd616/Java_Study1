
import java.util.*;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> que = new PriorityQueue<>();
		que.add(2); que.add(3); que.add(1);
		que.add(5); que.add(4);
		System.out.println(que);
		while(que.size()>0) {
			System.out.println(que.poll());
		}
	}
	
}
