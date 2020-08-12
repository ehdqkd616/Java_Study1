
public class LamdaExample {

	public static void main(String[] args) {
		System.out.println(true ? "참입니다":"거짓입니다");
		System.out.println(false ? "참입니다":"거짓입니다");
		System.out.println(a(1==2));
		System.out.println(oddEvenI(4));
		oddEvenII(4);
		
	}

	static String a(boolean a) {
		return a ? "참입니다" : "거짓입니다";
	}
	
	static String oddEvenI(int a) {
		return a%2 == 0 ? "짝수입니다" : "홀수입니다";
	
	}
	static String oddEvenII(int a) {
		System.out.println(a%2 == 0 ? "짝수입니다" : "홀수입니다");
		return null;
	}
}
