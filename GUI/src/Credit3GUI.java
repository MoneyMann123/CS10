import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Credit3GUI {

	private JFrame frame;
	private JTextField fnl;
	private JTextField LNN;
	private JTextField G2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credit3GUI window = new Credit3GUI();
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
	public Credit3GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 595, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 559, 293);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel fn = new JLabel("First Name");
		fn.setBounds(37, 11, 72, 21);
		panel.add(fn);
		
		fnl = new JTextField();
		fnl.setFont(new Font("Tahoma", Font.ITALIC, 11));
		fnl.setBounds(119, 11, 168, 20);
		panel.add(fnl);
		fnl.setColumns(10);
		
		JLabel Ln = new JLabel("Last Name");
		Ln.setBounds(37, 47, 58, 17);
		panel.add(Ln);
		
		LNN = new JTextField();
		LNN.setBounds(119, 45, 168, 19);
		panel.add(LNN);
		LNN.setColumns(10);
		
		JLabel ag = new JLabel("Age");
		ag.setBounds(37, 85, 46, 14);
		panel.add(ag);
		
		G2 = new JTextField();
		G2.setBounds(119, 85, 72, 20);
		panel.add(G2);
		G2.setColumns(10);
		
		JButton sub = new JButton("Submit");
		sub.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String FN = fnl.getText();
				String LN = LNN.getText();
				String ag = G2.getText();
				
				dis.setText("First name: ")
				
			}
		});
		sub.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		sub.setBounds(171, 140, 126, 23);
		panel.add(sub);
		
		JLabel or = new JLabel("OR");
		or.setHorizontalAlignment(SwingConstants.CENTER);
		or.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		or.setBounds(321, 144, 46, 14);
		panel.add(or);
		
		JButton res = new JButton("Reset");
		res.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				fnl.setText(" ");
				LNN.setText(" ");
				G2.setText(" ");
			}
		});
		res.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		res.setBounds(392, 140, 126, 23);
		panel.add(res);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 197, 539, 85);
		panel.add(panel_1);
	}
}
