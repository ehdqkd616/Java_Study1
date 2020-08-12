import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		int index = 0;
		int [] lotto = {0, 0, 0, 0, 0, 0};
		while(true) {	//무한루프
			int ran = (int)(Math.random()*45)+1;//번호 추첨
			int i=0;
			for(i=0; i<index; i++) {
				if(ran==lotto[i]) {//추첨된 번호
					break;
				}
			}
			if(i==index) {//추첨된 번호에 있지 않음
				lotto[index++] = ran;
			}
			if(index>5) {//6개 번호 추첨이 끝남
				break;
			}
		}
	System.out.println(Arrays.toString(lotto));
	}
}
