package static_;

public class StaticInit {
	
	
	static { //static 초기화자, 한번만 실행할때, 생성자를 static으로 써서 전부 공유하고 싶을때
		System.out.println("초기화자 실행");
	}
	
	public StaticInit() {
		System.out.println("생성자 실행");
	}
	
	public static void main(String[] args) {
		new StaticInit();
		new StaticInit();
	}
	
}

