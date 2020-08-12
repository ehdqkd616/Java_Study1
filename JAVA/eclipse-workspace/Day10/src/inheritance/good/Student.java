package inheritance.good;

public class Student extends Person {

	public int studentId;
	
	public String getDetails() {
		return super.getDetails()+", 학번 : "+studentId;
	}
	
	public Student(String name, int age, int studentId) {
		super(name,age);
		this.studentId = studentId;
	}
	
	
}
