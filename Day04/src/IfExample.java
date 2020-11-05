
public class IfExample {

	public static void main(String[] args) {
		int a = (int)(Math.random()*10+1);
		if(a>5) {
			System.out.printf("a는 %d\n", a);
			System.out.println("a는 5보다 큽니다");
		}
		else {
			System.out.printf("a는 %d\n", a);
			System.out.println("a는 5보다 작습니다");
		}
	}

}
