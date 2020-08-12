
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		que.add(1); que.add(2); que.add(3); 
		que.add(4); que.add(5); 
		System.out.println(que.peek());
		while(que.size()>0) {
			System.out.println(que.poll());
		}
		System.out.println(que.peek()); //EmptyStackException이 발생하지 않고 null 값이 들어감.
										//{}형태로 리스트 형태가 존재하기 때문에 예외가 발생하지 않는다.
	}

}
