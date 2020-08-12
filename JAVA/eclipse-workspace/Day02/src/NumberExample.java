
public class NumberExample {

	public static void main(String[] args) {
//		byte a = 128;
//		short b = 32768;
//		int c = 2147483648; - 타입 범위를 넘어서는 값은 할당 불가
//		long d = 1L; - long 타입 선언은 뒤에 L표시
		
		byte a = 0b0000_0101;//0b0000_0000 이진법 선언
		byte b = 001;//0+진법 8진법 선언
		byte c = 0x0010;//0x+진법 16진법 선언
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
