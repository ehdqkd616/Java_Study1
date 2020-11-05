
public class LogicalExample {

	public static void main(String[] args) {
		
		int x = 10, y = 20;
		if ((x != 10) & (++y == 21)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("x : " + x + ", y : " + y);
		
		//왜 y가 22로 출력되는가!?
		if ((x == 10) | (++y == 21)) {
			System.out.println("ture");
		}else {
			System.out.println("false");
		}
		System.out.println("x : " + x + ", y : " + y);

		int a = 10, b = 20;
		if ((a != 10) && (++b == 21)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("a : " + a + ", b : " + b);
		
		if ((a == 10) || (++b == 21)) {
			System.out.println("ture");
		}else {
			System.out.println("false");
		}
		System.out.println("a : " + a + ", b : " + b);
	}//end main
}//end c
