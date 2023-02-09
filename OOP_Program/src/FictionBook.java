import java.time.Year;

public class FictionBook implements Author2,Book2 {
	private String author_name,email,title;
	private int publicYear;
	
	public FictionBook(String title,int publicYear) {
		this.title=title;
		this.publicYear=publicYear;
	}
	public void setAuthorName(String name) {
		this.author_name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public boolean checkFormatName() {
		if(this.author_name.trim().contains(" ")) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String getLastName() {
		int index = this.author_name.lastIndexOf(" ");
		return this.author_name.toUpperCase().substring(index+1);
	}
	@Override
	public String getFirstName() {
		int index = this.author_name.lastIndexOf(" ");
		return this.author_name.toLowerCase().substring(0,index);
	}
	@Override
	public boolean checkEmail() {
		if(this.email.endsWith("@hotmail.com")||this.email.endsWith("@windowslive.com")){
			return true;
		}
	}
	@Override
	public int totalPublicYear() {
	return Year.now().getValue()-this.publicYear;
}
	public String toString() {
		return title +" write by "+getLastName().substring(0)+","+getFirstName()+" ("+email+" )"+"\nPublished for "+totalPublicYear()+"years.";
	}
}
