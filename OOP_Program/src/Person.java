
public class Person {
	private String firstName;
	private String lastName;

	// Default Constructor
	public Person() {
		firstName = "";
		lastName = "";
	}
	
	//Constructor with parameters
	public Person(String first, String last) {
		setName(first,last);
	}

	public void setName(String first, String last) {
		firstName=first;
		lastName=last;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	//Method to output the first and last name
	public String toString() {
		return firstName+" "+lastName;
	}

}
