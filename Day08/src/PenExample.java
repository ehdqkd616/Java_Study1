
public class PenExample {

	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.color = "검정색";
		p1.price = 1000;
		// == Pen p1 = new Pen("검정색", 1000);
		
		Pen p2 = new Pen();
		p2.color = "빨강색";
		p2.price = 1500;
		// == Pen p2 = new Pen("빨강색", 1500);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.printf("이 펜의 색깔은 %s, 가격은 %d 입니다.\n", p1.color,p1.price);
		System.out.printf("이 펜의 색깔은 %s, 가격은 %d 입니다.\n", p2.color,p2.price);
	}

}
