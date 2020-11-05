package stream_;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 4284055224407638242L;
	
	private String name;
	private char gender;
	private String email;
	private transient int birthYear;
	
	public Customer(String name, char gender, String email, int birthYear) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + ", birthYear=" + birthYear + "]";
	}
	
}

