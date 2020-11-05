
public class ArithmeticExample {

	public static void main(String[] args) {
		byte a = 1;
		byte b = 1;
		//int형 이하끼리의 연산(byte, short, char, int)
		//결과는 무조건 값이 int형으로 반환됨.
		byte c = (byte)(a+b);
		
		int d = 3;
		double e = 2;
		double f = d/e;
		
		System.out.println(f);
	}
}
