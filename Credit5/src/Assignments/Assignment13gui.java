package Assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Assignment13gui {

	private JFrame frame;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment13gui window = new Assignment13gui();
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
	public Assignment13gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel input = new JPanel();
		input.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(input, BorderLayout.CENTER);
		input.setLayout(null);
		
		JLabel title = new JLabel("Printing Price Calculator");
		title.setForeground(Color.PINK);
		title.setFont(new Font("Segoe Script", Font.PLAIN, 18));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(75, 11, 287, 26);
		input.add(title);
		
		JLabel lblNewLabel = new JLabel("Enter the number of copies to be printed:");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		lblNewLabel.setBounds(28, 72, 256, 21);
		input.add(lblNewLabel);
		
		output = new JTextField();
		output.setBackground(Color.GRAY);
		output.setForeground(Color.BLACK);
		output.setBounds(299, 72, 63, 20);
		input.add(output);
		output.setColumns(10);
		
		JLabel dis = new JLabel("");
		dis.setForeground(Color.PINK);
		dis.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		dis.setBounds(188, 158, 198, 32);
		input.add(dis);
		
		JLabel Dis = new JLabel("");
		Dis.setForeground(Color.PINK);
		Dis.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		Dis.setBounds(188, 125, 198, 32);
		input.add(Dis);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String num = output.getText();
				int num1 = Integer.parseInt(num);
				
				if(num1 < 100)
				{
					Dis.setText("Price per copy is: $0.30");
					dis.setText("Total cost is: $" + num1 * 0.30);
				}
				else if(num1 > 100 && num1 < 499) 
				{
					Dis.setText("Price per copy is: $0.28" + "\n");
					dis.setText("Total cost is: $" + num1 * 0.28);
				}
				else if(num1 > 500 && num1 < 749) 
				{
					Dis.setText("Price per copy is: $0.27" + "\n");
					dis.setText("Total cost is: $" + num1 * 0.27);
				}
				else if (num1 > 750 && num1 < 1000)
				{
					Dis.setText("Price per copy is: $0.26" + "\n");
					dis.setText("Total cost is: $" + num1 * 0.26);
				}
				else if(num1 > 1000)
				{	
					Dis.setText("Price per copy is: $0.25" + "\n");
					dis.setText("Total price is: $" + num1 * 0.25);
				}
				
			}
		});
		
		
		submit.setBackground(new Color(0, 191, 255));
		submit.setForeground(Color.BLACK);
		submit.setBounds(40, 125, 89, 23);
		input.add(submit);
		
		JButton resest = new JButton("Reset");
		resest.setBackground(Color.PINK);
		resest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		resest.setBounds(40, 164, 89, 23);
		input.add(resest);
	
		
	}
}
