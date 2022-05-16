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
	private JTextField textField;

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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel title = new JLabel("Printing Price Calculator");
		title.setForeground(Color.PINK);
		title.setFont(new Font("Segoe Script", Font.PLAIN, 18));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(75, 11, 287, 26);
		panel.add(title);
		
		JLabel lblNewLabel = new JLabel("Enter the number of copies to be printed:");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		lblNewLabel.setBounds(28, 72, 256, 21);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.GRAY);
		textField.setForeground(Color.BLACK);
		textField.setBounds(299, 72, 63, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton submit = new JButton("Submit");
		submit.setBackground(new Color(0, 191, 255));
		submit.setForeground(Color.BLACK);
		submit.setBounds(40, 125, 89, 23);
		panel.add(submit);
		
		JButton resest = new JButton("Reset");
		resest.setBackground(Color.PINK);
		resest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		resest.setBounds(40, 164, 89, 23);
		panel.add(resest);
		
		JLabel dis = new JLabel("");
		dis.setForeground(Color.PINK);
		dis.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		dis.setBounds(188, 125, 216, 65);
		panel.add(dis);
	}
}
