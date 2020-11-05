import java.util.Scanner;

public class ReverseExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		for(int i=a.length(); i>0; i--) {
			//charAt(몇 번째 숫자) - 해당 String의 숫자 번째 글자값 char로 리턴
			System.out.print(a.charAt(i-1));
		}
	}
}
