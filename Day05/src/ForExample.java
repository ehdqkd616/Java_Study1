
public class ForExample {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum = sum+(i+1);
			System.out.printf("현재 sum 값 : %d\n", sum);
		}	
		String[] array = {"안","녕","하","세","요"};
		for(int i=1; i<array.length; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i);	
			}
		}
	}
}
