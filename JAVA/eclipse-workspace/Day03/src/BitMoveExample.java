
public class BitMoveExample {

	public static void main(String[] args) {
		int a = 128;
		System.out.println(a<<2); //2를 두번 곱한 효과
		System.out.println(a>>2); //2를 두번 나눈 효과
		a = -128;
		System.out.println(a>>2); //2를 두번 나눈 효과
		System.out.println(a>>>2);
		
	}

}
