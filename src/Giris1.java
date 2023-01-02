

import java.awt.Color;
import java.awt.Image;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingUtilities;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author huseyinerkek
 */
public class Giris1 extends javax.swing.JFrame {
    private String dosyaYolu =""; //Dosya yolu ilk basta bos olarak seciliyor.
    private ArrayList<String> katilanlar = new ArrayList<String>(); // İsimleri arraylistte tutmak icin degisken tanimliyoruz.
    private Set<String> kazananlar = new TreeSet<String>(); // Sirayla yazilsin diye TreeSet yapisini kullandik.
    private DefaultListModel model = new DefaultListModel();
    
    
    
    
    
    /**
     * Creates new form Giris1
     */
    public Giris1() {
        initComponents();
        KazananlarListesi.setModel(model);
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        aramaCubugu = new javax.swing.JTextField();
        aramaCubugu.setBackground(new Color(240, 189, 163));
        aramaCubugu.setToolTipText("Lütfen Dosya Seçiniz");
        jScrollPane1 = new javax.swing.JScrollPane();
        KazananlarListesi = new javax.swing.JList<>();
        KazananlarListesi.setBackground(new Color(240, 189, 163));
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        siralama = new javax.swing.JList<>();
        siralama.setBackground(new Color(240, 189, 163));
        gozat_btn = new javax.swing.JButton();
        cekilis_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(170, 121, 65));
        //aramaCubugu.setOpaque(true);
        //aramaCubugu.setBackground(Color.MAGENTA); // Burada JTextField icin renk degisimi yapiyoruz.
        aramaCubugu.setEditable(false);
        aramaCubugu.addActionListener(new java.awt.event.ActionListener() {
        	
           
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aramaCubuguActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(KazananlarListesi);

        jLabel1.setFont(new java.awt.Font("Kohinoor Devanagari", 3, 14)); // NOI18N
        jLabel1.setText("Kazananlar");

        siralama.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Kazanan :", "1. Yedek :", "2. Yedek :" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        siralama.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                siralamaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(siralama);

        gozat_btn.setText("Bul");
        
        Image img =  new ImageIcon(this.getClass().getResource("seo-and-web.png")).getImage();
        gozat_btn.setIcon(new ImageIcon(img));
        gozat_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
                jButton1ActionPerformed(evt);
                
            }
        });

        cekilis_btn.setText("Çekiliş Yap");
        Image img1 =  new ImageIcon(this.getClass().getResource("spin.png")).getImage();
        cekilis_btn.setIcon(new ImageIcon(img1));
        cekilis_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
                
            }
        });
        
        btnNewButton = new JButton("Ana Sayfa");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Ana_Sayfa ana = new Ana_Sayfa();
        		ana.setVisible(true);
        		 JComponent comp = (JComponent) e.getSource();
                 Window win = SwingUtilities.getWindowAncestor(comp);
                 win.dispose();
        	}
        });
        
        btnNewButton_1 = new JButton("Çekiliş Sonuçları");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		CekilisSonuclari sonuc = new CekilisSonuclari();
        		sonuc.setVisible(true);
        		JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp);
                win.dispose();
        	}
        });
        
        btnNewButton_2 = new JButton("Çekilişe Katıl");
        btnNewButton_2.addActionListener(new ActionListener() {
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
        
        txtekiliSayfasnaHo = new JTextField();
        txtekiliSayfasnaHo.setBackground(new Color(170, 121, 65));
        txtekiliSayfasnaHo.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 22));
        txtekiliSayfasnaHo.setText("Çekiliş Sayfasına Hoş Geldiniz");
        txtekiliSayfasnaHo.setEditable(false);
        txtekiliSayfasnaHo.setColumns(10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addGap(397)
        						.addComponent(gozat_btn, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addGap(109)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jLabel1)
        							.addGroup(jPanel1Layout.createSequentialGroup()
        								.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
        									.addGroup(jPanel1Layout.createSequentialGroup()
        										.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        											.addComponent(cekilis_btn, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
        											.addComponent(btnNewButton_1))
        										.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
        										.addComponent(btnNewButton_2)))))))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(19)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(aramaCubugu, GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnNewButton))))
        			.addContainerGap(31, Short.MAX_VALUE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(59)
        			.addComponent(txtekiliSayfasnaHo, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        			.addGap(54))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(29)
        			.addComponent(txtekiliSayfasnaHo, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(gozat_btn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        				.addComponent(aramaCubugu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(cekilis_btn, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnNewButton)
        				.addComponent(btnNewButton_1)
        				.addComponent(btnNewButton_2))
        			.addGap(11))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void aramaCubuguActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            // TODO add your handling code here:
    	
    	
            JFileChooser dosyasec = new JFileChooser();
            
            int i = dosyasec.showOpenDialog(this);
            // Kontrol etmek icin 
            if(i == JFileChooser.APPROVE_OPTION){
                
                this.dosyaYolu = dosyasec.getSelectedFile().getPath(); // Bizim dosyamizi secicek sonra bizim dosyamizin yolunu göstericek.
                aramaCubugu.setText(dosyaYolu); //dosyayolunu pencereye yazdirir.
                
                
            }
    }                                        

    public void cekilisYap() throws IOException{
        // Bazen swing uygulamalarinda turkce karakter sikinti cikarabiliyor bunun icin İSO olan kodu yaziyoruz.
        // Burada Scanner dan okudugumuz dosyayi BufferedReader den okuyacacagiz.
        //InputStreamReader Belli char setlerini eklememize yariyor.
        //new FileInputStream Dosyamin yolunu vermke icin kullanilir.
        //"ISO-8859-9" turkce karakter set kodu.
        
       
    	try(BufferedReader okuma= new BufferedReader(new InputStreamReader(new FileInputStream(dosyaYolu)))){
            String kisi;
            //Bunu scannerla yapabilirdik fakat bize turkce karakater kullanmamza izin vermiyor.
            while((kisi=okuma.readLine()) != null){
            //Burda dosyamizin her satiri kisiye esitlenmis olacak.
            katilanlar.add(kisi);
            
                
                
            }
                    
                    
        // Hatalarimi yakalamak icin     
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Giris1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Giris1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(kazananlar.size() != 3){
           Random random = new Random(); // Random metodunu import ediyoruz 
            int kazanan_indeks = random.nextInt(katilanlar.size()); // katinlarlarin sayisi kadar kisiyi random olarak atanam yaoar.
            kazananlar.add(katilanlar.get(kazanan_indeks)); // katilanlarin kazanan indeksini kazanlara atiyorum.
            
            
            
             
            
            
        }
        
        
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            
        if(this.dosyaYolu.equals("")){ // Dosyanın boş olup olmadığını kontrol eder.
                JOptionPane.showMessageDialog(this,"Lütfen Bir Dosya Seçiniz");
                
                
                
            }
        else {
            try {
                cekilisYap();
            } catch (IOException ex) {
                Logger.getLogger(Giris1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            for (String kazanan : kazananlar){ // for each yapisi 
                model.addElement(kazanan);
                
                
                
                
            }
            
            
            
        }
            
    }                                        

    private void siralamaAncestorAdded(javax.swing.event.AncestorEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Giris1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giris1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giris1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giris1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giris1().setVisible(true);
            }
        });
    }

                   
    private javax.swing.JList<String> KazananlarListesi;
    private javax.swing.JTextField aramaCubugu;
    private javax.swing.JButton gozat_btn;
    private javax.swing.JButton cekilis_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> siralama;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    private JTextField txtekiliSayfasnaHo;
}