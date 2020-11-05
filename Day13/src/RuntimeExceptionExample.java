
public class RuntimeExceptionExample {

	public static void main(String[] args) {
//		IndexOut();
//		Null();
//		ClassCast();
		Arith();
	}
	
	public static void IndexOut() {
		int[] a = new int[5];
		int b = (int)(Math.random()*10);
		for(int i=0; i<b; i++) {
			System.out.print(a[i]);
		}
	}
	
	public static void Null() {
		String a = null;
		System.out.println(a==null);
		System.out.println(a.charAt(0));
	}
	
	public static void ClassCast() {
		String a = "123";
		Object b = a;
		Integer c = (Integer)b;
	}
	
	public static void Arith() {
		int a = 0;
		int b = 10/a;
		System.out.println(b);
	}
	
}
