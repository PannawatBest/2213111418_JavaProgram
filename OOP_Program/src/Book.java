import java.time.Year;

public class Book {
	// attributes
	private String title;
	private float price;
	private int publishyer;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public float getPrice() {
		return price;
	}
	public void setPublishyear(int year) {
		publishyer=year;
	}
	public int getPulishyear() {
		return publishyer;
	}
	public int getTotalYear() {
		return Year.now().getValue()-publishyer;
	}
	public String toString() {
		return "Title: "+this.title+" published for "+getTotalYear()+" year ("+this.price+" baht).";
	}

}
