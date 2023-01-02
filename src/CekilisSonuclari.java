import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JLabel;

public class CekilisSonuclari extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CekilisSonuclari frame = new CekilisSonuclari();
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
	public CekilisSonuclari() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 523);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mnıtmNewMenuItem = new JMenuItem("Sosyal Medya Çekilişleri");
		menuBar.add(mnıtmNewMenuItem);
		
		JMenuItem mnıtmNewMenuItem_1 = new JMenuItem("Süper Loto");
		menuBar.add(mnıtmNewMenuItem_1);
		
		JMenuItem mnıtmNewMenuItem_2 = new JMenuItem("Milli Piyango");
		menuBar.add(mnıtmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(170, 121, 65));
		panel.setBounds(6, 6, 617, 483);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Ana Sayfa");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ana_Sayfa anasayfa = new Ana_Sayfa();
				anasayfa.setVisible(true);
				JComponent comp = (JComponent) e.getSource();
	            Window win = SwingUtilities.getWindowAncestor(comp);
	            win.dispose();
			}
		});
		btnNewButton_2.setBounds(41, 417, 117, 29);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Çekilişe Katıl");
		btnNewButton_1.addActionListener(new ActionListener() {
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
		btnNewButton_1.setBounds(239, 417, 117, 29);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Çekiliş Yap");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Giris1 cekilisyap = new Giris1();
				cekilisyap.setVisible(true);
				JComponent comp = (JComponent) e.getSource();
	            Window win = SwingUtilities.getWindowAncestor(comp);
	            win.dispose();
			}
		});
		btnNewButton.setBounds(427, 417, 117, 29);
		panel.add(btnNewButton);
		
		JLabel piyango = new JLabel("");
		piyango.setBounds(158, 36, 364, 324);
		panel.add(piyango);
		 
	        Image img3 =  new ImageIcon(this.getClass().getResource("poker-cards.png")).getImage();
	        piyango.setIcon(new ImageIcon(img3));
	        
	}
}
