import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		double width,length;
		String color;
		
		width = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		length = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		color = JOptionPane.showInputDialog("Input color");
		
		Rectangle rec = new Rectangle(width, length, color);
		JOptionPane.showMessageDialog(null, rec+"\nArea of Rectangle is "+rec.getArea());//call method form Rectangle class

	}

}
