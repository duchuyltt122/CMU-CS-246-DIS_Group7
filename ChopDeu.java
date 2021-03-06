package project;

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
/*
 * Huynh Ngoc Thinh
 * 05/01/2001
 */
public class ChopDeu extends JFrame {

	private JPanel contentPane;
	
	private JTextField textSA;
	private JTextField textDay;
	public float canhben ;
	public float day;
	/**
	 * Launch the application.
	 */
	//function nay la khi khoi tao se chay GUI
 	public static void main(String[] args) {
 		EventQueue.invokeLater(new Runnable() {
 			public void run() {
 				try {
 					ChopDeu frame = new ChopDeu();
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
	public ChopDeu() {
		setTitle("Dien tich xung quanh hinh chop deu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
				//nhap do dai canh ben
				canhben = Float.parseFloat(textSA.getText());
				// nhap do dai canh day
				day= Float.parseFloat(textDay.getText());
				
			
			 double solve = dienTichXQ();
				String solve2 = Double.toString(solve);
				//show ket qua
				lbshowsolve.setText(solve2);
			}

			
		});
		
		}
	 //dien tich xung quanh
	public double dienTichXQ() {
		float p = (day*4)/2;
		 //do dai nua canh day
		float d =day/2;
		 //do dai trung doan
		 double x= Math.sqrt(canhben*canhben-d*d);
		
		 double solve=p*x;
		return solve;
	}
	}
