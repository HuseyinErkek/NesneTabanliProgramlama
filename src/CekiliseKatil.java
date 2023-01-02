import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Font;
import java.awt.Image;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class CekiliseKatil extends JFrame {

	private JPanel contentPane;
	private JTextField isimsoyisimgiris;
	private JTextField girdiekrani;
	private JTextField txtekiliKatlmaEkranna;
	private JButton btnNewButton_1;
	private JLabel resimkoyma;

	/**
	 * Launch the application.
	 * @throws IOException 
	 * 
	 */
	
		
	
	
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CekiliseKatil frame = new CekiliseKatil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		;
			
			
		}
	
		
		
		
		
		
	

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public CekiliseKatil() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		 
		panel.setBackground(new Color(170, 121, 65));
		panel.setBounds(6, 6, 646, 509);
		contentPane.add(panel);
		panel.setLayout(null);
		
		isimsoyisimgiris = new JTextField();
		isimsoyisimgiris.setBackground(new Color(240, 189, 163));
		isimsoyisimgiris.setEditable(false);
		isimsoyisimgiris.setText("İsim Ve Soyisim");
		isimsoyisimgiris.setBounds(32, 94, 130, 26);
		panel.add(isimsoyisimgiris);
		isimsoyisimgiris.setColumns(10);
		
		
		girdiekrani = new JTextField();
		girdiekrani.setBackground(new Color(240, 189, 163));
		girdiekrani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
						Scanner Scan = new Scanner(System.in);
						String str =Scan.next();
						File file = new File("Katilanlar.txt"); 
						if (!file.exists()) { file.createNewFile(); 
						} FileWriter fileWriter = new FileWriter(file, false); 
						BufferedWriter bWriter = new BufferedWriter(fileWriter); 
						bWriter.write(str); 
						bWriter.close();
					}
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		girdiekrani.setToolTipText("Bu Alan Boş Geçilemez");
		girdiekrani.setBounds(174, 94, 306, 26);
		panel.add(girdiekrani);
		girdiekrani.setColumns(10);
		
		
		
		
		
		JButton btnNewButton = new JButton("Kaydet");
		btnNewButton.setBounds(502, 94, 117, 29);
		panel.add(btnNewButton);
		
		txtekiliKatlmaEkranna = new JTextField();
		txtekiliKatlmaEkranna.setEditable(false);
		txtekiliKatlmaEkranna.setBackground(new Color(170, 121, 65));
		txtekiliKatlmaEkranna.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 24));
		txtekiliKatlmaEkranna.setText("Çekiliş Katılma Ekranına Hoşgeldiniz");
		txtekiliKatlmaEkranna.setBounds(65, 16, 516, 55);
		panel.add(txtekiliKatlmaEkranna);
		txtekiliKatlmaEkranna.setColumns(10);
		
		btnNewButton_1 = new JButton("Liste Görüntüle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListeGoruntule listegoruntule;
				try {
					listegoruntule = new ListeGoruntule();
					listegoruntule.setVisible(true);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				 JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp);
                win.dispose();
				try {
					File file = new File("Katilanlar.txt"); 
					FileReader fileReader = new FileReader(file); 
					String line; 
					BufferedReader br = new BufferedReader(fileReader); 
					while ((line = br.readLine()) != null) {
					 System.out.println(line); 
					} 
					br.close(); 
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(502, 124, 130, 29);
		panel.add(btnNewButton_1);
		
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
		btnNewButton_2.setBounds(61, 437, 117, 29);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Çekiliş Sonuçları");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CekilisSonuclari sonuc =new CekilisSonuclari();
				sonuc.setVisible(true);
				JComponent comp = (JComponent) e.getSource();
	            Window win = SwingUtilities.getWindowAncestor(comp);
	            win.dispose();
						
			}
		});
		btnNewButton_3.setBounds(236, 437, 174, 29);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Çekilliş Yap");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Giris1 giris = new Giris1();
				giris.setVisible(true);
				JComponent comp = (JComponent) e.getSource();
	            Window win = SwingUtilities.getWindowAncestor(comp);
	            win.dispose();
			}
		});
		btnNewButton_4.setBounds(464, 437, 117, 29);
		panel.add(btnNewButton_4);
		
		JLabel resimkoyma = new JLabel("");
		resimkoyma.setBounds(200, 147, 440, 285);
		panel.add(resimkoyma);
		 Image img2 =  new ImageIcon(this.getClass().getResource("slot-machine.png")).getImage();
	        resimkoyma.setIcon(new ImageIcon(img2));
	}
	}

