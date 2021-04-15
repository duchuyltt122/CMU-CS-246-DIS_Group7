import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Point;

public class Project extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project frame = new Project();
					frame.setLocation(600,200);
					frame.setResizable(false);
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
	public Project() {
		setResizable(false);
		setTitle("T\u00EDnh Di\u1EC7n T\u00EDch H\u00ECnh Kh\u1ED1i");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHinhHopChuNhat = new JButton("H\u00ECnh H\u1ED9p Ch\u1EEF Nh\u1EADt");
		btnHinhHopChuNhat.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnHinhHopChuNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HinhHopChuNhat f=new HinhHopChuNhat();
				f.setVisible(true);			
			}
		});
		btnHinhHopChuNhat.setBounds(150, 10, 146, 34);
		contentPane.add(btnHinhHopChuNhat);
		
		JButton btnHinhChop = new JButton("H\u00ECnh Ch\u00F3p");
		btnHinhChop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HinhChop f=new HinhChop();
				f.setVisible(true);	
			}
		});
		btnHinhChop.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnHinhChop.setBounds(150, 54, 146, 34);
		contentPane.add(btnHinhChop);
		
		JButton btnHinhCau = new JButton("H\u00ECnh C\u1EA7u");
		btnHinhCau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HinhCau f=new HinhCau();
				f.setVisible(true);	
			}
		});
		btnHinhCau.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnHinhCau.setBounds(150, 98, 146, 34);
		contentPane.add(btnHinhCau);
		
		JButton btnHinhLangTru = new JButton("L\u0103ng Tr\u1EE5 Tam Gi\u00E1c");
		btnHinhLangTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HinhLangTruTamGiac f=new HinhLangTruTamGiac();
				f.setVisible(true);	
			}
		});
		btnHinhLangTru.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnHinhLangTru.setBounds(150, 142, 146, 34);
		contentPane.add(btnHinhLangTru);
		
		JButton btnNewButton = new JButton("H\u00ECnh Tr\u1EE5");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HinhTru f=new HinhTru();
				f.setVisible(true);	
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton.setBounds(150, 186, 146, 34);
		contentPane.add(btnNewButton);
	}
}
