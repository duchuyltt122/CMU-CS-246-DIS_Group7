import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Chop_Deu extends JFrame {

	private JPanel contentPane;
	
	private JTextField textSB;
	private JTextField textSC;
	private JTextField textSA;
	private JTextField textSD;
	private JTextField textDay;

	/**
	 * Launch the application.
	 */
	//function nay la khi khoi tao se chay GUI
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chop_Deu frame = new Chop_Deu();
					frame.setLocationRelativeTo(null);
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
	//Thiet lap khoi tao GUI
	public Chop_Deu() {
		setTitle("Dien tich xung quanh hinh chop deu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTinh = new JButton("T\u00EDnh");
		
		btnTinh.setBounds(337, 27, 89, 52);
		contentPane.add(btnTinh);
		

		
		JLabel lblNewLabel = new JLabel("SA");
		lblNewLabel.setBounds(23, 27, 60, 20);
		contentPane.add(lblNewLabel);
		
		textSB = new JTextField();
		textSB.setColumns(10);
		textSB.setBounds(59, 72, 89, 23);
		contentPane.add(textSB);
		
		JLabel lblSB = new JLabel("SB");
		lblSB.setBounds(23, 75, 74, 20);
		contentPane.add(lblSB);
		
		textSC = new JTextField();
		textSC.setColumns(10);
		textSC.setBounds(59, 121, 89, 23);
		contentPane.add(textSC);
		
		JLabel lblSC = new JLabel("SC");
		lblSC.setBounds(23, 122, 74, 20);
		contentPane.add(lblSC);
		
		JLabel lblNewLabel_1 = new JLabel("   K\u1EBFt qu\u1EA3");
		lblNewLabel_1.setBounds(76, 205, 68, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lbshowsolve = new JLabel("");
		lbshowsolve.setBounds(154, 209, 46, 14);
		contentPane.add(lbshowsolve);
		
		textSA = new JTextField();
		textSA.setColumns(10);
		textSA.setBounds(59, 26, 89, 23);
		contentPane.add(textSA);
		
		JLabel lblNewLabel_2 = new JLabel("SD");
		lblNewLabel_2.setBounds(23, 160, 87, 23);
		contentPane.add(lblNewLabel_2);
		
		textSD = new JTextField();
		textSD.setColumns(10);
		textSD.setBounds(59, 160, 89, 23);
		contentPane.add(textSD);
		
		JLabel lblNewLabel_3 = new JLabel("C\u1EA1nh \u0111\u00E1y");
		lblNewLabel_3.setBounds(174, 27, 60, 20);
		contentPane.add(lblNewLabel_3);
		
		textDay = new JTextField();
		textDay.setColumns(10);
		textDay.setBounds(224, 26, 89, 23);
		contentPane.add(textDay);
		//Event tinh ket qua
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float a = Float.parseFloat(textSA.getText());
				float b = Float.parseFloat(textSB.getText());
				float c = Float.parseFloat(textSC.getText());
				float d = Float.parseFloat(textSD.getText());
				float day= Float.parseFloat(textDay.getText());
				
				
			 float p = (a+b+c+d)/2;
			 double m=2.0*day*day;
			 double x= Math.sqrt(m)/2;
			 double solve=p*x;
				String solve2 = Double.toString(solve);
				//show ket qua
				lbshowsolve.setText(solve2);
			}
		});
		
	}
}
