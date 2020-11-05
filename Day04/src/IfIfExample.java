
public class IfIfExample {

	public static void main(String[] args) {
		int a = (int)(Math.random()*10+1);
		if(a%2==0) {
			if(a%3==0) {
				System.out.printf("a는 %d\n", a);
				System.out.println("a는 2와 3의 공배수입니다.");
			}else if(a%5==0) {
				System.out.printf("a는 %d\n", a);
				System.out.println("a는 2와 5의 공배수입니다.");
			}else {
				System.out.printf("a는 %d\n", a);
				System.out.println("a는 2의 배수입니다.");
			}
		}else if(a%3==0) {
			System.out.printf("a는 %d\n", a);
			System.out.println("a는 3의 배수입니다.");
		}else if(a%5==0) {
			System.out.printf("a는 %d\n", a);
			System.out.println("a는 5의 배수입니다.");
		}else {
			System.out.printf("a는 %d\n", a);
			System.out.println("a는 1 또는 7입니다.");
		}
	}

}
