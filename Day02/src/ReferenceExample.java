import java.util.Arrays;

public class ReferenceExample {

	public static void main(String[] args) {
		int[] a1 = {4,1,2,5,2,6,7,8};
		//참조형 데이터는 주소값을 가짐 - 주소값 할당
		//같은 곳을 가리키는 형태 - a1을 바꾸든 a2를 바꾸든 같은 값 변경
		int[] a2 = a1;
		System.out.println(Arrays.toString(a1));
		a2[2] = 10;
		a2[6] = 9;
		System.out.println(Arrays.toString(a1));

	}

}
