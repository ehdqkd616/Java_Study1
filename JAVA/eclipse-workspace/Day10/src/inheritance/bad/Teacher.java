package inheritance.bad;

public class Teacher {

	public String name;
	public int age;
	public String subject;
	
	public String getDetails() {
		return "이름 : "+name+", 나이 : "+age+", 과목 : "+subject;
	}
	
	public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
}
