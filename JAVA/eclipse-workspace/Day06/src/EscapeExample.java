
public class EscapeExample {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		for(int b : a) {
			if(b==6) {
//				break; 반복문 종료
//				continue; 한 번 스킵
//				return; 메서드 종
			}
			System.out.print(b);
		}
	}
}
