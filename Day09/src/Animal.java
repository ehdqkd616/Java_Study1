
public class Animal {

	public String name;
	public int age;
	public String species;
	public int hungry = 50;
	
	public void eat(String food) {
		hungry += 5;
		System.out.println(food+"를 먹습니다.");
		System.out.printf(name+"의 현재 공복도 : %d\n", hungry);
	}
	
	public void play() {
		hungry -= 15;
		System.out.println(name+"(이/가) 잘 놀았습니다.");
		System.out.printf(name+"의 현재 공복도 : %d\n", hungry);
		if(hungry<30) {
			bark();
		}
	}
	
	public void walk() {
		hungry -= 10;
		System.out.println(name+"(이/가) 산책을 다녀왔습니다.");
		System.out.printf(name+"의 현재 공복도 : %d\n", hungry);
		if(hungry<30) {
			bark();
		}
	}
	
	public void bark() {
		System.out.println("왈왈!!!!");
		
	}
	
	public Animal() {
		
	}
	
	public Animal(String name, int age, String species, int hungry) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.hungry = hungry;
	}
	
}

