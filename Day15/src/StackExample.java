import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.add(1); stack.add(2); stack.add(3);
		stack.add(4); stack.add(5);
		System.out.println(stack.peek());
		while(stack.size()>0) {
			System.out.println(stack.pop());
		}
		System.out.println(stack.peek()); //EmptyStackException
										  //{}형태가 아니고 데이터가 없기 때문에 예외문제 발생. 
		
		Stack<String> history = new Stack<>();
		history.add("다음"); history.add("다음웹툰");
		history.add("들쥐");
		System.out.println(history.pop());
	}
	
}
