
public class TryCatchExample {

	public static void main(String[] args) {
		int[] a = new int[5];
		int b = (int)(Math.random()*10);
		for(int i=0; i<b; i++) {
			try {
				System.out.print(a[i]);
			}catch(RuntimeException e) {
				System.out.println("잘못된 인덱스 지정 : "+e.getMessage());
			}
		}
		System.out.println("실행 완료.");
	}
}
