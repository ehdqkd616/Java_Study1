
public class PyramidExample {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i-1; j++) {
				System.out.printf(" ");
				}
			for(int j=0; j<2*i+1; j++) {
				System.out.printf("*");
				}	
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf(" ");
				}
			for(int j=0; j<(2*5)-(2*i)-1; j++) {
				System.out.printf("*");
				}	
			System.out.println();
		}
	}
}
	
	