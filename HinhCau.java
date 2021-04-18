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

public class HinhCau extends JFrame {



//	/**
//	 * Launch the application.
//	 */
//	function nay la khi khoi tao se chay GUI
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HinhCau frame = new HinhCau();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private JPanel contentPane;
	private JTextField textChieuCao;
	private JTextField textBankinh;
	
	/**
	 * Create the frame.
	 */
	//Thiet lap khoi tao GUI
	public HinhCau() {
		setTitle("Dien tich xung quanh hinh cau");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTinh = new JButton("T\u00EDnh");
		
		btnTinh.setBounds(23, 124, 89, 52);
		contentPane.add(btnTinh);
		

		
		JLabel lblNewLabel = new JLabel("    B\u00E1n k\u00EDnh");
		lblNewLabel.setBounds(23, 27, 60, 20);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("   K\u1EBFt qu\u1EA3");
		lblNewLabel_1.setBounds(141, 139, 68, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lbHienKetQua = new JLabel("");
		lbHienKetQua.setBounds(219, 139, 46, 20);
		contentPane.add(lbHienKetQua);
		
		textBankinh = new JTextField();
		textBankinh.setColumns(10);
		textBankinh.setBounds(130, 27, 89, 23);
		contentPane.add(textBankinh);
		
		//Event tinh ket qua
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int BanKinh=0;
				do {
						/*Ban kinh hinh cau*/
						String r = textBankinh.getText();
						
						if(r == null ||  r.equals("")) 
							return;
						else {
							try {
								BanKinh = Integer.parseInt(r);		
							} catch (Exception e) {
								continue;
							}
						}
				}while(BanKinh<0);
				
				//Dien tich xung quanh
				double Sxungquanh = 4*Math.PI*BanKinh*BanKinh;
				
				//show ket qua
				String solve = String.valueOf(Sxungquanh);
				lbHienKetQua.setText(solve);
			}
		});
		
	}
	
}