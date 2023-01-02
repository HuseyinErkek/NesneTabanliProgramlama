import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;

public class Ana_Sayfa extends JFrame {

	private JPanel contentPane;
	private JTextField txtekiliUygulamasnaHo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ana_Sayfa frame = new Ana_Sayfa();
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
	public Ana_Sayfa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(170, 121, 65));
		panel.setBounds(6, 10, 498, 404);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Çekişile Katıl");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CekiliseKatil katil = new CekiliseKatil();
					katil.setVisible(true);
					JComponent comp = (JComponent) e.getSource();
	                 Window win = SwingUtilities.getWindowAncestor(comp);
	                 win.dispose();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
				}
				
				
				
				
			}
		});
		btnNewButton.setBounds(6, 369, 117, 29);
		panel.add(btnNewButton);
		
		JButton cekilissonuclari = new JButton("Çekiliş Sonuçları");
		
		cekilissonuclari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			CekilisSonuclari sonuc =new CekilisSonuclari();
			sonuc.setVisible(true);
			JComponent comp = (JComponent) e.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
			}
		});
		cekilissonuclari.setBounds(166, 369, 162, 29);
		panel.add(cekilissonuclari);
		
		JButton btnNewButton_2 = new JButton("Çekiliş Yap");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Giris1 cekilisyap = new Giris1();
				cekilisyap.setVisible(true);
				 JComponent comp = (JComponent) e.getSource();
                 Window win = SwingUtilities.getWindowAncestor(comp);
                 win.dispose();
				
			}
		});
		btnNewButton_2.setBounds(360, 369, 117, 29);
		panel.add(btnNewButton_2);
		
		JLabel resim = new JLabel("");
		resim.setVerticalAlignment(SwingConstants.BOTTOM);
		resim.setBounds(117, 39, 452, 318);
		panel.add(resim);
		 Image img2 =  new ImageIcon(this.getClass().getResource("dart-board.png")).getImage();
	        resim.setIcon(new ImageIcon(img2));
	        
	        txtekiliUygulamasnaHo = new JTextField();
	        txtekiliUygulamasnaHo.setText("Çekiliş Uygulamasına Hoş Geldiniz");
	        txtekiliUygulamasnaHo.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 24));
	        txtekiliUygulamasnaHo.setBackground(new Color(170, 121, 65));
	        txtekiliUygulamasnaHo.setEditable(false);
	        txtekiliUygulamasnaHo.setBounds(18, 39, 459, 50);
	        panel.add(txtekiliUygulamasnaHo);
	        txtekiliUygulamasnaHo.setColumns(10);
		 
		
	}
}
