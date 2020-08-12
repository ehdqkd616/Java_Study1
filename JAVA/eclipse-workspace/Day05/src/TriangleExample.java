
public class TriangleExample {

	public static void main(String[] args) {
		for(int j=0; j<5; j++) {
			for(int i=0; i<j+1; i++) {
				System.out.printf("*");	
			}
			System.out.println();
		}
		System.out.println();
		// -로 실행
		for(int j=5; j>=0; j--) {
			for(int i=0; i<j; i++) {
				System.out.printf("*");	
			}
			System.out.println();
		}
		System.out.println();
		// +로 실행
		for(int j=0; j<5; j++) {
			for(int i=0; i<5-j; i++) {
				System.out.printf("*");	
			}
			System.out.println();
		}		
	}
}
