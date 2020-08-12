import java.util.Scanner;

public class ReverseHomeWork {

	public static void main(String[] args) {
		System.out.print("회문인지 아닌지 판단할 문장 : ");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		for(int i=0; i<sentence.length()/2; i++) {
			if(sentence.charAt(i)!=sentence.charAt(sentence.length()-1-i)) {
				System.out.println("회문이 아닙니다.");
				return;				
			}
		}
		System.out.println("회문 입니다.");
	}
}
