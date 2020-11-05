
public class ArrayExample {

	public static void main(String[] args) {
		int[] a; //배열 선언 방법 - 데이터타입[] 이름;
		a = new int[6]; //배열의 초기화 - 몇 칸인지만 정해져도 됨
		int[] b = {3,5,1,2,3,1}; //배열 선언 및 초기화
		System.out.println(b[2]); //자바의 인덱스(순서)는 0부터 출발
		b[5] = 2010;
		System.out.println(b[5]);
		System.out.println(b);
	}

}
