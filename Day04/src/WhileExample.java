
public class WhileExample {

	public static void main(String[] args) {
		int a = 1;
		int sum = 0;		
		while(a<=10) {
			sum = sum+a;
			a++; //sum += a++;
		}
		System.out.printf("1 ~ 10의 총 합은 : %d\n", sum);
	}

}
