
public class DiamondExample {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i-1; j++) {
				System.out.printf(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.printf("*");
			}	
			System.out.println();
		}
		for(int i=1; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf(" ");
			}
			for(int j=0; j<(2*5)-(2*i)-1; j++) {
				System.out.printf("*");
			}	
			System.out.println();
		}
		System.out.println();
		//다이아몬드 공백 만들기
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i-1; j++) {
				System.out.printf(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				if(j==0 || j==2*i) {
					System.out.printf("*");
				}else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
		for(int i=1; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf(" ");
			}
			for(int j=0; j<(2*5)-(2*i)-1; j++) {
				if(j==0 || j==8-2*i) {
					System.out.printf("*");
				}else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//다이아몬드 $채우기
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i-1; j++) {
				System.out.printf(" ");
				}
			for(int j=0; j<2*i+1; j++) {
				 if(j==0 || j==2*i) {
					 System.out.printf("*");
				 }else {
					 if(j%2==0) {
						 System.out.printf("$");
					 }else {
						 System.out.printf(" ");
					 }
				 }
			}
			System.out.println();
		}
		for(int i=1; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf(" ");
				}
			for(int j=0; j<(2*5)-(2*i)-1; j++) {
				if(j==0 || j==8-2*i) {
					System.out.printf("*");
				}else {
					if(j%2==0) {
						System.out.printf("$");
					}else {
						System.out.printf(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
