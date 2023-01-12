
public class Product {
	// Attributes
	private String id;
	private int unit;
	private double price;

//method
	public void setid(String ID) {
		id = ID;
	}

	public String getid() {
		return id;
	}

	public void setUnit(int UNIT) {
		unit = UNIT;
	}

	public int getUnit() {
		return unit;
	}

	public void setPrice(double PRICE) {
		price = PRICE;
	}

	public double getPrice() {
		return price;
	}

	public double calculate() {
		return unit * price;
	}
}
