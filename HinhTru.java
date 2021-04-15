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

public class HinhTru extends JFrame {



//	/**
//	 * Launch the application.
//	 */
//	function nay la khi khoi tao se chay GUI
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					HinhTru frame = new HinhTru();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	
	private JPanel contentPane;
	private JTextField textChieuCao;
	private JTextField textBankinh;
	
	/**
	 * Create the frame.
	 */
	//Thiet lap khoi tao GUI
	public HinhTru() {
		setTitle("Dien tich xung quanh hinh tru");
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
		
		textChieuCao = new JTextField();
		textChieuCao.setColumns(10);
		textChieuCao.setBounds(130, 72, 89, 23);
		contentPane.add(textChieuCao);
		
		JLabel lblChiuRng = new JLabel("   Chi\u1EC1u cao");
		lblChiuRng.setBounds(23, 75, 60, 20);
		contentPane.add(lblChiuRng);
		
		JLabel lblNewLabel_1 = new JLabel("   K\u1EBFt qu\u1EA3");
		lblNewLabel_1.setBounds(141, 139, 68, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lbHienKetQua = new JLabel("");
		lbHienKetQua.setBounds(219, 139, 46, 14);
		contentPane.add(lbHienKetQua);
		
		textBankinh = new JTextField();
		textBankinh.setColumns(10);
		textBankinh.setBounds(130, 27, 89, 23);
		contentPane.add(textBankinh);
		
		//Event tinh ket qua
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int ChieuCao=0;
				int BanKinh=0;
				do {
						/*Ban kinh day*/
						String r = textBankinh.getText();
						
						/*Chieu cao (khoang cach giua 2 tam cua 2 day*/
						String h = textChieuCao.getText();
						
						if(r == null || h == null || r.equals("") || h.equals("")) 
							return;
						else {
							try {
								ChieuCao = Integer.parseInt(h);
								BanKinh = Integer.parseInt(r);		
							} catch (Exception e) {
								continue;
							}
						}
				}while(ChieuCao <0 || BanKinh<0);
				
				//Dien tich xung quanh
				double Sxungquanh = 2*Math.PI*ChieuCao*BanKinh;
				
				//show ket qua
				String solve = String.valueOf(Sxungquanh);
				lbHienKetQua.setText(solve);
			}
		});
		
	}
	
}
