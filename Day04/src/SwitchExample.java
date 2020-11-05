
public class SwitchExample {

	public static void main(String[] args) {
		int a = (int)(Math.random()*100+1);
		switch(a/10) {
		case 10 :
			System.out.printf("귀하의 점수는 %d\n", a);
			System.out.println("만점입니다");
			break;
		case 9 : 
			System.out.printf("귀하의 점수는 %d\n", a);
			System.out.println("A학점 입니다");
			break;
		case 8 : 
			System.out.printf("귀하의 점수는 %d\n", a);
			System.out.println("B학점 입니다");
			break;
		case 7 : 
			System.out.printf("귀하의 점수는 %d\n", a);
			System.out.println("C학점 입니다");
			break;
		case 6 : 
			System.out.printf("귀하의 점수는 %d\n", a);
			System.out.println("D학점 입니다");
			break;
		default :
			System.out.printf("귀하의 점수는 %d\n", a);
			System.out.println("F학점 입니다");
			System.out.println("재수강 하세요.");
		}
	}
}
