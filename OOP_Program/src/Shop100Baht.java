
import javax.swing.*;
public class Shop100Baht {

	public static void main(String[] args) {
		Product arnupab = new Product();
		int check = JOptionPane.showConfirmDialog(null,"is the program run on Pattankarn Branch?", "Run Program",JOptionPane.YES_NO_OPTION);
		if(check==0) {
			arnupab = new PattanakarnBranch();
		}
		arnupab.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		
		JOptionPane.showMessageDialog(null, arnupab);

	}

}
