
public class HomeWork {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.printf("%2d : ", i);	
			for(int j=1; j<=i; j++) {
				System.out.printf("%d ", j);	
			}
			System.out.println();
		}
	}
}
