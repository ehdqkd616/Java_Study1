
public class Gugudan {

	public static void main(String[] args) {
		
		//횡으로 출력
		for(int j=1; j<=9; j++) {
			for(int i=2; i<=9; i++) {
			System.out.printf("%d*%d=%2d\t", i, j, i*j);	
			}
			System.out.println();
		}
		System.out.println();
		//종으로 출력
		for(int j=2; j<=9; j++) {
			for(int i=1; i<=9; i++) {
			System.out.printf("%d*%d=%2d\t", j, i, i*j);	
			}
			System.out.println();
		}
	}

}
