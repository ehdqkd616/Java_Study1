package exception_;

public class CustomerExceptionExample {

	public static void main(String[] args) throws DuplicateException {
		int a = (int)(Math.random()*10);
		if(a>4) {
			throw new DuplicateException("a가 5보다 큼");			
		}
		System.out.println(a);
	}
	
}
