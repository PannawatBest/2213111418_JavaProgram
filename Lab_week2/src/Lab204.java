import javax.swing.*;
import java.util.*;
import java.text.*;


public class Lab204 {
	
	static final double TAX_RATE = .0625;
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("##.0");
		String IDstr = JOptionPane.showInputDialog("This program calculates the total cost of a CD order"+
	                                               "\nPlease enter the ID of the CD");
		String CDstr = JOptionPane.showInputDialog("Please enter the title of the CD");
		String Pricestr = JOptionPane.showInputDialog("Please enter the price of the CD in U.S.dollars");
		double price = Double.parseDouble(Pricestr);
		String Purchstr = JOptionPane.showInputDialog("Please enter the quanitity to be purchsed");
		int    purch = Integer.parseInt(Purchstr);
		double subtotal = price*purch;
		double total = subtotal*(1+TAX_RATE);
		JOptionPane.showMessageDialog(null, "Summary of the transaction: "+
		"\n"+
				"\nCD ID: "+IDstr+
				"\nCD Title: "+CDstr+
				"\nCD Unit Price:"+price+
				"\nCD Quantity: "+purch
				+"\n"+
				"\nSubtotal: $"+frm.format(subtotal)+
				"\nTax rate: "+TAX_RATE*100+"%"+
				"\nTotal: $"+total+
				"\n"+
				"\nEnd of Program");
		
		
		
		

	}

}
