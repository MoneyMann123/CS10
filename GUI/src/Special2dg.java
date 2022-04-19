import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Special2dg {

	private JFrame frame;
	private JTextField twodgt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Special2dg window = new Special2dg();
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
	public Special2dg() {
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
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel twodg = new JLabel("Enter 2 digits");
		twodg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		twodg.setBounds(10, 23, 89, 22);
		panel.add(twodg);
		
		twodgt = new JTextField();
		twodgt.setBounds(106, 26, 86, 20);
		panel.add(twodgt);
		twodgt.setColumns(10);
		
		JLabel dis = new JLabel("New label");
		dis.setBounds(10, 161, 298, 55);
		panel.add(dis);
		
		JButton en = new JButton("Enter");
		en.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String twoDigit = twodgt.getText();
				int twoD = Integer.parseInt(twoDigit);
				int firstD = twoD / 10;
				
				//int sum = 
				
				
				
			}
		});
		en.setBounds(275, 69, 107, 35);
		panel.add(en);
		
		JButton clr = new JButton("Clear");
		clr.setBounds(275, 127, 107, 35);
		panel.add(clr);
	}
}
