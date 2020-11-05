
public class TypeExample {

	public static void main(String[] args) {
		byte a = 1;
		//자동 형변환 - 작은 타입을 큰 타입에 넣을때는 상관 없음
		int b = a;
		//큰 타입을 작은 타입에 할당할때는 형변환 연산자 필요
		//변할수 있는 타입끼리만 가능(ex.숫자는 숫자끼리 숫자-문자 불가능)
		byte c = (byte)b;
		System.out.println(c);
		
		int d = 250;
		byte e = (byte)d;
		System.out.println(e);
	}

}
