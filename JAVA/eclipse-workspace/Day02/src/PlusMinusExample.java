
public class PlusMinusExample {

	public static void main(String[] args) {
		int a = 1;
		int b = ++a;
		System.out.println("a 값 : "+a+", b 값 : "+b);
		System.out.printf("a 값 : %d, b 값 : %d\n", a, b);
		
		int x = 1;
		System.out.println(x);
		int y = x++;
		System.out.printf("x 값 : %d, y 값 : %d\n", x,y);
		System.out.printf("%d", x);
	}

}
