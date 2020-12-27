import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Frame1 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField textFieldAns;
	private JLabel lblNewLabel;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(20, 29, 180, 34);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(236, 29, 180, 34);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
				ans = num1 + num2;
				textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}	
				
		});
		btnNewButton.setBounds(74, 94, 95, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
				ans = num1 - num2;
				textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton_1.setBounds(231, 94, 95, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(236, 206, 180, 34);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		lblNewLabel = new JLabel("The Answer is");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(42, 210, 138, 24);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton_2 = new JButton("MULTIPLY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
				ans = num1 * num2;
				textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setBounds(74, 141, 95, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("DIVIDE");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
				ans = num1 / num2;
				textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton_3.setBounds(231, 141, 95, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}
