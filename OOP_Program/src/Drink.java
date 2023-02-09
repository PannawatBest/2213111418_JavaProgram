
public class Drink {
	private int type;
	private char size;
	
	public Drink(int type,char size) {
		this.type=type;
		this.size=size;
	}
	public Drink() {
		this.type=0;
		this.size=' ';
	}
	public String getTypeName() {
		if(type==1) {
			return "Hot";
		}else if(type==2) {
			return "Cold";
		}else {
			return "";
		}
	}
	public int getTypePrice() {
		if(type==1) {
			return 10;
		}else if(type==2) {
			return 20;
		}else {
			return 0;
		}
	}
	public String getSizeName() {
		if(size=='S') {
			return "Small";
		}else if(size=='M') {
			return "Medium";
		}else if(size=='L'){
			return "Large";
		}else {
			return "";
		}
	}
	public int getSizePrice() {
		if(size=='S') {
			return 15;
		}else if(size=='M') {
			return 20;
		}else if(size=='L'){
			return 2;
		}else {
			return 0;
		}
	}
	public int getTotalPrice() {
		return getTypePrice()+getSizePrice();
	}

}
