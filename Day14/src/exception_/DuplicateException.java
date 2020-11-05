package exception_;

import java.util.HashSet;

public class DuplicateException extends Exception {

	public DuplicateException(String message) {
		super(message);
	}
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("1234");
		set.add("123");
	}
}
