import java.util.Scanner;

public class ScoreExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학점 계산기");
		System.out.println("점수를 입력하세요 : (입력 범위 0 ~ 100)");
		int score = scan.nextInt();
		switch(score/10) { // = switch(scan.nextInt()/10 );
		case 10 :
			System.out.printf("귀하의 점수는 %d 입니다.\n", score);
			System.out.println("만점입니다");
			break;
		case 9 : 
			System.out.printf("귀하의 점수는 %d 입니다.\n", score);
			System.out.println("A학점 입니다");
			break;
		case 8 : 
			System.out.printf("귀하의 점수는 %d 입니다.\n", score);
			System.out.println("B학점 입니다");
			break;
		case 7 : 
			System.out.printf("귀하의 점수는 %d 입니다.\n", score);
			System.out.println("C학점 입니다");
			break;
		case 6 : 
			System.out.printf("귀하의 점수는 %d 입니다.\n", score);
			System.out.println("D학점 입니다");
			break;
		default :
			System.out.printf("귀하의 점수는 %d 입니다.\n", score);
			System.out.println("F학점 입니다");
			System.out.println("재수강 하세요.");
			
			scan.close();
		}
	}
}