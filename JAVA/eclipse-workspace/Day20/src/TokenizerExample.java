import java.util.*;

public class TokenizerExample {

	public static void main(String[] args) {
		String a = "This, is a/test";
		StringTokenizer st = new StringTokenizer(a,",/ ",true);
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		a = "김연우,M.my4my4@nate/com;1900";
		st = new StringTokenizer(a,",./;");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
