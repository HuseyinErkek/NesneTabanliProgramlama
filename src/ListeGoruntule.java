import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ListeGoruntule extends JFrame {

	private JPanel contentPane;
	private JTextField txtKatlanlarListesi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListeGoruntule frame = new ListeGoruntule();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public ListeGoruntule() throws IOException {
		setBackground(new Color(254, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(170, 121, 65));
		panel.setBounds(6, 6, 589, 493);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Geri");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CekiliseKatil katil = new CekiliseKatil();
					katil.setVisible(true);
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
		btnNewButton.setBounds(23, 437, 117, 29);
		panel.add(btnNewButton);
		
		
		
		
		txtKatlanlarListesi = new JTextField();
		txtKatlanlarListesi.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 16));
		txtKatlanlarListesi.setForeground(new Color(254, 255, 255));
		txtKatlanlarListesi.setBackground(new Color(170, 121, 65));
		txtKatlanlarListesi.setEditable(false);
		txtKatlanlarListesi.setText("Katılanlar Listesi");
		txtKatlanlarListesi.setBounds(88, 13, 252, 26);
		panel.add(txtKatlanlarListesi);
		txtKatlanlarListesi.setColumns(10);
		
		JList katilanlar = new JList();
		katilanlar.setBounds(65, 85, 391, 315);
		panel.add(katilanlar);
		File archivo = new File("Katilanlar.txt");
	    FileReader fr = new FileReader(archivo);
	    BufferedReader br = new BufferedReader(fr);

	    Vector<String> lines = new Vector<String>();

	    String line;
	    while ((line = br.readLine()) != null) {
	      lines.add(line);
	    }
	    JOptionPane.showMessageDialog(null, new JScrollPane(new JList(lines)));
	    fr.close();
	  
        
       line = br.readLine();
       while ( (line = br.readLine()) != null) 
       {
            lines.addElement(line);		
		
       }
	}
}
	

