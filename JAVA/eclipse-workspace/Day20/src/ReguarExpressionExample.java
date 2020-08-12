
public class ReguarExpressionExample {

	public static void main(String[] args) {
		
		String a = "010-0000-0000";
		if(a.matches("[0][1][0-9](-|\\s)[0-9]{3,4}(-|\\\\s)[0-9]{4}")) {
			System.out.println("실행");
		}
		a = "rudy@garlic.co.kr";
		if(a.matches("\\w+@\\w+\\..+")) {
			System.out.println("이메일 실행");
		}
		a = "rudy@garlic.co.kr";
		if(a.matches("\\w+@\\w+\\.([a-z]|\\.)+")) {
			System.out.println("이메일 실행");
		}else {
			System.out.println("이메일 실행 안됨.");
		}
	}
}
