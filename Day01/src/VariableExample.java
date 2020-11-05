
public class VariableExample {
	//멤버변수(인스턴스변수) 초기화 하지 않아도 시스템적으로 초기화
	static int b; //b는 VariableExample에서 정의된 멤버변수
	
	public static void main(String[] args) {
		//변수 선언 - 타입 이름;
		//지역안에서 만들었음 - 지역변수
		//명시적으로 무조건 초기화 해 주어야함.
		int a; //a는 main에서 정의된 지역변수
		//지역번수는 초기화 하지 않으면 사용 불가 - 값이 없음
		System.out.println(a);
		System.out.println(b);
		//변수의 초기화 - 변수이름 = 값;
		a = 10;
		System.out.println(a);
		//자바에서의 =은 오른쪽 값을 왼쪽에 할당한다는 뜻
		//오른쪽 실행 후 왼쪽에 할당
		a = a+1;
		System.out.println(a);
	}

}
