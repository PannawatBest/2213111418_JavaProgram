import java.io.*;
import java.util.*;

public class ATMChecking extends ATMData {
	private int money;

	public ATMChecking(String accountNumber, String password, int money) {
		super(accountNumber, password);
		this.money = money;
	}

	public boolean checkBookBank() throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("ATMBookBank.txt"));
		String temp = "";
		boolean check = false;
		while ((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			if(data[0]==super.getID()&&data[1]==super.getPass()&&Integer.parseInt(data[2])<=this.money) {
				return check = true;
			}else {
				return check = false;
			}
		}
		read.close();
		return check;
	}

	public void show() throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("ATMBookBank.txt"));
		String temp = "";
		int i=0;
		while ((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			if(Integer.parseInt(data[2])<=this.money) {
				i=Integer.parseInt(data[2]);
			}
		}
		System.out.println("You drawing for "+this.money%2f+" , get");
		int thou=1000,fhun=500,hun=100;
		thou = this.money;
		fhun = this.money;
		hun  = this.money;
		System.out.println("1000 = "+thou);
		System.out.println("500 = "+fhun);
		System.out.println("100 = "+hun);
		System.out.println("Your balance is "+(i-this.money)%2f+" Baht");
		read.close();
	}
}
