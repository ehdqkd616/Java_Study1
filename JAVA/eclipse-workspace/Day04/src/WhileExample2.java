
public class WhileExample2 {

	public static void main(String[] args) {
		int a = 0;
		int sum = 0;		
		while(a<=10) {
			sum = sum+a;
			a = a+2; //sum += a++;
		}
		System.out.printf("1 ~ 10의 짝수들의 총 합은 : %d\n", sum);
	}

}
