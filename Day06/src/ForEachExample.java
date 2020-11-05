
public class ForEachExample {

	public static void main(String[] args) {
		int[] intArray = new int[10];
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = 10-i;
		}
		for(int a : intArray) {
			System.out.print(a);
		}
	}
}
