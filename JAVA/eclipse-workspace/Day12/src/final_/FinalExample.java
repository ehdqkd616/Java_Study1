package final_;

public class FinalExample {

	public static void main(String[] args) {
		
		int b = 10;
		//1. 선언시, 2. 초기화자, 3. 기본생성자에서 무조건 초기화
		final int c = 10;
		
		final int a = 10;
		// a = 11; final 선언 이후에 다른 값 할당 불가
		final FinalExample b = new FinalExample();
		b.b = 12;
		// b = new FinalExample(); 인스턴스 변수 자체는 변경 불가
	}

}
