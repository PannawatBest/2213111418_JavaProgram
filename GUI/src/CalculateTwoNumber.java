import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;
	private JLabel lblResult;
	private JLabel lblOperator;
	private JComboBox chOperator;
	private JLabel rdbOperator;
	private JLabel lblNewLabel;
	private JCheckBox chkDialogBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setTitle("CalculateTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumber1.setBounds(26, 19, 96, 14);
		contentPane.add(lblNumber1);

		txtNumber1 = new JTextField();
		txtNumber1.setBounds(157, 8, 105, 36);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);

		JLabel lblNumber2 = new JLabel("Enter Number2");
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumber2.setBounds(26, 70, 96, 14);
		contentPane.add(lblNumber2);

		txtNumber2 = new JTextField();
		txtNumber2.setBounds(157, 59, 105, 36);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);

		lblResult = new JLabel("Show Reult");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResult.setBounds(157, 309, 82, 14);
		contentPane.add(lblResult);

		chOperator = new JComboBox();
		chOperator.setBounds(157, 106, 105, 22);
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");

		lblOperator = new JLabel("Operator");
		lblOperator.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOperator.setBounds(26, 113, 96, 14);
		contentPane.add(lblOperator);
		
		rdbOperator = new JLabel("How to show Digit");
		rdbOperator.setBounds(26, 149, 96, 14);
		contentPane.add(rdbOperator);
		
		final JRadioButton OneDigit = new JRadioButton("1 Digit");
		OneDigit.setBounds(157, 145, 109, 23);
		contentPane.add(OneDigit);
		
		final JRadioButton TwoDigit = new JRadioButton("2 Digit");
		TwoDigit.setBounds(157, 171, 109, 23);
		contentPane.add(TwoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(OneDigit);
		group.add(TwoDigit);
		
		lblNewLabel = new JLabel("Option to show");
		lblNewLabel.setBounds(26, 215, 96, 14);
		contentPane.add(lblNewLabel);
		
		chkDialogBox = new JCheckBox("Show Result at DialogBox");
		chkDialogBox.setBounds(157, 211, 157, 23);
		contentPane.add(chkDialogBox);
		
		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, sum = 0;
				String operator;
				// JButton
				if (e.getSource() == btnOK) {
					// JComboBox
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					operator = (String) chOperator.getSelectedItem();
					if (operator.equals("+"))
						sum = num1 + num2;
					if (operator.equals("-"))
						sum = num1 - num2;
					if (operator.equals("*"))
						sum = num1 * num2;
					if (operator.equals("/"))
						sum = num1 / num2;
					
					//JRadioButton
					DecimalFormat frmNumber = null;
					if(OneDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}
					else if (TwoDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}

					lblResult.setText(String.format("%.2f", sum));
					
					//JCheckBox
					if(chkDialogBox.isSelected()) {
						JOptionPane.showMessageDialog(null,"Result is : "+sum);
						
					}
					

				}
			}
		});

		contentPane.add(chOperator);

		btnOK.setBounds(126, 350, 89, 23);
		contentPane.add(btnOK);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(225, 350, 89, 23);
		contentPane.add(btnExit);
		
	}
}
