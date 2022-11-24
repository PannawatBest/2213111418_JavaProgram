import javax.swing.*;
import java.text.*;

public class Lab302 {

	public static void main(String[] args) {
DecimalFormat frm = new DecimalFormat("##.0");
		
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		int height = Integer.parseInt(JOptionPane.showInputDialog("Input Height:"));
		double bmi = weight / ((height*height)/100)*100;
		
		JOptionPane.showMessageDialog(null, "BMI =  "+frm.format(bmi)+
				"\nYou're "+(bmi<18.5? "Underweight" : bmi<=24.9? "Normal-weight": bmi<29.9? "Over-weight":"obesity"),
				"BMI",
				JOptionPane.WARNING_MESSAGE);
	}

}
