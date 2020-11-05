
public class CharExample {

	public static void main(String[] args) {
		char a = 'b';
		char b = '\uAD10';
		char c = '\'';
		char d = '\"';
		char e = '\t';
		char f = '\n';
		int aa = 10;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(a+b+c+d);
		System.out.println(""+a+b+c+d);
		System.out.printf("%c, %c, %c, %c, %c, %d",b,c,d,e,f,aa);
		
	}

}
