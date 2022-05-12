package Assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Assignment8twodigitgui {

	private JFrame frame;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment8twodigitgui window = new Assignment8twodigitgui();
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
	public Assignment8twodigitgui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(new Color(0, 0, 102));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel title = new JLabel("Place Value Finder");
		title.setForeground(Color.CYAN);
		title.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 18));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(116, 11, 197, 28);
		panel.add(title);
		
		output = new JTextField();
		output.setBounds(195, 70, 58, 24);
		panel.add(output);
		output.setColumns(10);
		
		JLabel input = new JLabel("Enter a two digit number:");
		input.setForeground(Color.CYAN);
		input.setFont(new Font("Yu Gothic", Font.ITALIC, 14));
		input.setHorizontalAlignment(SwingConstants.CENTER);
		input.setBounds(20, 71, 165, 28);
		panel.add(input);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				output.setText("");
				
				
			}
		});
		reset.setForeground(Color.WHITE);
		reset.setBackground(new Color(0, 153, 204));
		reset.setBounds(295, 105, 89, 23);
		panel.add(reset);
		
		JLabel dis = new JLabel("");
		dis.setHorizontalAlignment(SwingConstants.CENTER);
		dis.setForeground(Color.WHITE);
		dis.setBounds(20, 180, 364, 28);
		panel.add(dis);
		
		JLabel Dis = new JLabel("");
		Dis.setHorizontalAlignment(SwingConstants.CENTER);
		Dis.setForeground(Color.WHITE);
		Dis.setBounds(20, 208, 364, 28);
		panel.add(Dis);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String num = output.getText();
				int num1 = Integer.parseInt(num);
				
				int tens = num1/10;
				int ones = num1 % 10;
				
				dis.setText("The tens-place digit is: " + tens);
				Dis.setText("The ones-place digit is: " + ones);
				
				
				
			}
		});
		submit.setForeground(Color.WHITE);
		submit.setBackground(new Color(0, 153, 204));
		submit.setBounds(295, 71, 89, 23);
		panel.add(submit);
	
	}

}
