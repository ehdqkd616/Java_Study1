import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.next();
		System.out.println(data);
		System.out.println("숫자를 입력하세요 : ");
		int score = scan.nextInt();
		System.out.println(score);
		scan.close();
	}
}