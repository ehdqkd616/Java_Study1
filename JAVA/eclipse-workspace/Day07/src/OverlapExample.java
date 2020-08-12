import java.util.Scanner;

public class OverlapExample {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		System.out.print("숫자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		int i = 0;
		for(i=0; i<a.length; i++) {
			if(a[i]==b) {
				break;
			}
		}
		if(i<a.length) {
			System.out.printf("입력하신 숫자는 %d\n", b);
			System.out.println("중복되었습니다.");
		}else {
			System.out.printf("입력하신 숫자는 %d\n", b);
			System.out.println("중복되지 않았습니다.");
		}
	}
}
