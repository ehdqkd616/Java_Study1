
public class PrimeFactorExample {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
		//연산을 좀더 줄여서 표현하는 법(1과 자기 자신을 빼고 연산)
		for(int i=2; i<=100; i++) {
			int count=0;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.printf("%d ", i);
			}
		}
	}
}
