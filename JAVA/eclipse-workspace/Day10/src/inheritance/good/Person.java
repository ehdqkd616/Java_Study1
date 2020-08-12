package inheritance.good;

public class Person {

	public String name;
	public int age;
	
	public String getDetails() {
		return "이름 : "+name+ ", 나이 : "+age;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//Override : 재정의, toString과 equals를 Object에서 다시 불러와서 재정의하는 이유 : 주소값이 아닌 실제 데이터를 return하기 위해서
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
