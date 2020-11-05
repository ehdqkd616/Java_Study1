
public class MethodExample {

	public static void main(String[] args) {
		//메서드 호출 - 메서드이름(매개변수);
		//메서드 = 리턴 결과
		//add라는 메서드는 int(숫자)형을 리턴 - 숫자값과 같음
		int a = add(100,200);
		System.out.println(a);
	}

	//메서드 선언 방식 - 리턴타입 이름(매개변수)
	static int add(int a, int b) {
		return a+b;
		
	}
	
}
