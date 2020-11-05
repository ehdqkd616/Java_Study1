
public class IfIfExample2 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*100+1);
		if(a>=95) {
			System.out.printf("귀하의 점수는 %d\n", a);
			System.out.println("학점은 A+ 입니다");
		}else if(a>=90) {
			System.out.printf("귀하의 점수는 %d\n", a);
			System.out.println("학점은 A 입니다");
		}else if(a>=85) {
			System.out.printf("귀하의 점수는 %d\n", a);
			System.out.println("학점은 B+ 입니다");
		}else if(a>=80){
			System.out.printf("귀하의 점수는 %d\n", a);
			System.out.println("학점은 B 입니다");
		}else if(a>=75){
			System.out.printf("귀하의 점수는 %d\n", a);
			System.out.println("학점은 C+ 입니다");
		}else if(a>=70){
			System.out.printf("귀하의 점수는 %d\n", a);
			System.out.println("학점은 C 입니다");
		}else if(a>=60){
			System.out.printf("귀하의 점수는 %d\n", a);
			System.out.println("학점은 D 입니다");
		}else {
			System.out.printf("귀하의 점수는 %d\n", a);
			System.out.println("학점은 F 입니다");
			}
		}
	}
