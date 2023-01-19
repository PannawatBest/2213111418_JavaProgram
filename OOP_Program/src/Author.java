
public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name,String email,char gendar) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Author(String name,String email) {
		this.name=name;
		this.email=email;
		gender = ' ';
	}
	public Author() {
		name = email = "";
		gender = ' ';
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGenderName() {
		if(Character.toLowerCase(this.gender)=='M') {
			return "Male";
		}
		else if(Character.toLowerCase(this.gender)=='F') {
			return "Female";
		}else {
			return "";
		}
	}
	public String toString() {
		return "Author name: "+name+"("+email+";"+getGenderName()+")";
	}

}
