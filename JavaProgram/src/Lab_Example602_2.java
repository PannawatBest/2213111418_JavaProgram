import javax.swing.*;
import javax.swing.text.html.parser.Parser;
public class Lab_Example602_2 {

	public static void main(String[] args) {
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		boolean deptWasFound = false;
		String dept = JOptionPane.showInputDialog("Enter a department name");
		
		for(int i=0;i<deptName.length;i++) {
			if(dept.equalsIgnoreCase(deptName[i])) {
				deptWasFound = true;
			}
		}
		/*if(deptWasFound) {
			JOptionPane.showMessageDialog(null, dept+ " was found in the list");
		}else {
			JOptionPane.showMessageDialog(null, dept+ " was not found in the list");
		}*/
		
		JOptionPane.showMessageDialog(null, dept=deptWasFound? "was found in the list":"was not found in the list");
		
		
	}

}
