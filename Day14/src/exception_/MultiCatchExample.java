package exception_;

public class MultiCatchExample {

	public static void main(String[] args) {
		try {
			a();
			b();
			c();
		}catch(IndexOutOfBoundsException e) {
			System.out.println("a메서드 예외 발생");
			System.out.println("예외 원인 : "+e.getMessage());
		}catch(NullPointerException | ArithmeticException e) {
			System.out.println("b 또는 c 메서드 예외 발생");
			System.out.println("예외 원인 : "+e.getMessage());
		}
		System.out.println("메인 실행 완료.");
	}
	
	public static void a() throws IndexOutOfBoundsException {
		String[] hi = {"안", "녕", "하", "세", "요"};
		int a = (int)(Math.random()*10);
		for(int i=0; i<a; i++) {
			System.out.print(hi[i]+" ");
		}
	}
	
	public static void b() throws NullPointerException {
		String[] bye = {"안", "녕", "히","가", "세", "요", null, null, null, null};
		int a = (int)(Math.random()*10);
		for(int i=0; i<a; i++) {
			System.out.print(bye[i]+" ");
		}
	}
	
	public static void c() throws ArithmeticException {
		int a = (int)(Math.random()*2);
		int b = 10/a;
		System.out.print(b);
	}
}
