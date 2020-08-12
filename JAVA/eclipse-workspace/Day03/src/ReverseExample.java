
public class ReverseExample {

	public static void main(String[] args) {
		byte a = 1; //0000_0001
		System.out.println(~a); //1111_1110
		System.out.println(!(1==2));
		System.out.println(reverse(10));
		
	}

	static int reverse(int a) {
		return ~a+1;
	}
	
	
	
}
