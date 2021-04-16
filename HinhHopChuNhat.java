
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
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class HinhHopChuNhat extends JFrame {
	
	private JPanel contentPane;
	private JTextField textcc;
	private JTextField textcd;
	private JTextField textcr;
	private JTextField textkq;
	
	public HinhHopChuNhat() {
			setTitle("DIEN TICH XUNG QUANH HINH HOP CHU NHAT");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnTinh = new JButton("T\u00EDnh");
			btnTinh.setForeground(Color.RED);
			btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			btnTinh.setBounds(23, 181, 89, 52);
			contentPane.add(btnTinh);
			

			
			JLabel cd = new JLabel("Chi\u1EC1u D\u00E0i");
			cd.setBounds(23, 28, 60, 20);
			contentPane.add(cd);
			
			textcc = new JTextField();
			textcc.setColumns(10);
			textcc.setBounds(130, 112, 89, 23);
			contentPane.add(textcc);
			
			JLabel cc = new JLabel("Chi\u1EC1u Cao");
			cc.setBounds(23, 115, 60, 20);
			contentPane.add(cc);
			
			JLabel lblNewLabel_1 = new JLabel("   K\u1EBFt qu\u1EA3");
			lblNewLabel_1.setForeground(Color.RED);
			lblNewLabel_1.setBounds(169, 196, 68, 23);
			contentPane.add(lblNewLabel_1);
			
			textcd = new JTextField();
			textcd.setColumns(10);
			textcd.setBounds(130, 27, 89, 23);
			contentPane.add(textcd);
			
			JLabel cr = new JLabel("Chi\u1EC1u R\u1ED9ng");
			cr.setBounds(23, 76, 75, 14);
			contentPane.add(cr);
			
			textcr = new JTextField();
			textcr.setBounds(130, 73, 89, 20);
			contentPane.add(textcr);
			textcr.setColumns(10);
			
			textkq = new JTextField();
			textkq.setBackground(Color.CYAN);
			textkq.setBounds(247, 197, 96, 20);
			contentPane.add(textkq);
			textkq.setColumns(10);
			
			//Event tinh ket qua
			btnTinh.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					int cd=0;
					int cr=0;
					int cc=0;
					do {
							
							String cdai = textcd.getText();
							String crong = textcr.getText();						
							String ccao = textcc.getText();
							// Nhap lai ket qua neu nhap sai
							if(cdai == null || crong == null ||ccao == null || cdai.equals("") || crong.equals("") || ccao.equals("") ) 
							{
								JOptionPane.showMessageDialog(getContentPane(), "Invalid input");
								return;
							}
							else {
								try {
									cd = Integer.parseInt(cdai);
									cr = Integer.parseInt(crong);
									cc = Integer.parseInt(ccao);
								} catch (Exception e) {
									continue;
								}
							}
					}while(cd <0 || cr<0 || cc<0);
					
					//Dien tich xung quanh
					double Sxungquanh = (cd+cr)*2*cc;
					
					//show ket qua
					String solve = String.valueOf(Sxungquanh);
					textkq.setText(solve);
				}
			});
			
}



//	/**
//	 * Launch the application.
//	 */
//	function nay la khi khoi tao se chay GUI
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HinhHopChuNhat frame = new HinhHopChuNhat();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}		});
	}
}
