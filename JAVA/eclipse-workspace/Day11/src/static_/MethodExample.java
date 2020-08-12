package static_;

import java.util.Arrays;

public class MethodExample {

	public static void main(String[] args) {
		
		//1. 많이 호출해야 하는 경우
		System.out.println();
		//2. 인스턴스에 종속되지 않는 경우, 매개변수로만 돌아가는 경우
		String c = 100+"";
		int b = Integer.parseInt(c);
		System.out.println(b);
		b = (int)(Math.random());
		System.out.println(Arrays.toString(new int[3]));
		toString(new int[3]);
		
	}

	public static void toString(int[] a) {
		System.out.print("[");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.print("]");
	}
	
}
