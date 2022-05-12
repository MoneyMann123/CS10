

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PizzaCostgui {

	private JFrame frame;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaCostgui window = new PizzaCostgui();
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
	public PizzaCostgui() {
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
		panel.setBackground(new Color(0, 51, 0));
		panel.setForeground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel title = new JLabel("Pizza Cost Generator");
		title.setFont(new Font("MV Boli", Font.PLAIN, 18));
		title.setForeground(new Color(204, 153, 255));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(95, 11, 220, 38);
		panel.add(title);
		
		output = new JTextField();
		output.setBounds(309, 82, 64, 21);
		panel.add(output);
		output.setColumns(10);
		
		JLabel input = new JLabel("Enter the diameter of the pizza in inches:");
		input.setForeground(Color.WHITE);
		input.setFont(new Font("MV Boli", Font.PLAIN, 14));
		input.setHorizontalAlignment(SwingConstants.CENTER);
		input.setBounds(10, 79, 289, 24);
		panel.add(input);
		
		JLabel dis = new JLabel("");
		dis.setForeground(Color.WHITE);
		dis.setFont(new Font("MV Boli", Font.PLAIN, 14));
		dis.setBounds(23, 167, 383, 71);
		panel.add(dis);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String size = output.getText();
				int size1 = Integer.parseInt(size);
				
				double Laborcost = 0.75;//labor cost
				int rentCost = 1;//rental cost
				double materialCost = 0.05 * size1 * size1;//the total material cost
				
				double totalCost = materialCost + Laborcost + rentCost;//sum of all the services to determine the total price of the pizza
				
				dis.setText("The total cost of making the pizza is $" + totalCost);
				
				
				
			}
		});
		submit.setBackground(new Color(204, 153, 255));
		submit.setForeground(Color.WHITE);
		submit.setBounds(279, 133, 89, 23);
		panel.add(submit);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				output.setText("");
				dis.setText("");
				
				
			}
		});
		btnNewButton_1.setBackground(new Color(204, 153, 255));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(150, 133, 89, 23);
		panel.add(btnNewButton_1);
	}
}
