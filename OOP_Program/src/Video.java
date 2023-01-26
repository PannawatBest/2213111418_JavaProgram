
public class Video {
	private String title;
	private boolean checkOut = false;
	private double averageRaiting;
	private int ratingSum = 0;
	private int ratingCount = 0;

	public void setTitle(String iTitle) {
		title = iTitle;
	}
	public String getTitle() {
		return title;
	}
	public void addRating(int rate) {
		ratingSum += rate;
		ratingCount+=1;
		averageRaiting = ratingSum/ratingCount;
	}
	public double getRating() {
		return averageRaiting;
	}
	public void checkOut() {
		checkOut=true;
	}
	public void returnToStore() {
		checkOut=false;
	}
	public boolean isCheckOut() {
		return checkOut;
	}

}
