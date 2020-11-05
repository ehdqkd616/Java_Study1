package static_;

public class CountExample {

	public static void main(String[] args) {
		Count c1 = new Count();
		c1.a++; c1.b++;
		System.out.printf("c1의 a값 : %d, b값 : %d\n", c1.a, c1.b);
		
		Count c2 = new Count();
		c2.a++; c2.b++;
		System.out.printf("c2의 a값 : %d, b값 : %d\n", c2.a, c2.b);
		
		Count.b++;
		System.out.println(Count.b);
	}

}
