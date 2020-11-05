package exception_;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			a();
			b();
		}catch(Exception e) {
			System.out.println("예외 발생");
			System.out.println("예외 원인 : "+e.getMessage());
		}
		
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
	
}
