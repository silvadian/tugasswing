package biodata;
import java.awt.*;
import javax.swing.*;
import javax.swing.JScrollPane;

public class Biodata{
    public static void main(String[]args){
        GUI g =  new GUI();
    }
}

class GUI extends JFrame{
    JLabel lbiodata = new JLabel("BIODATA DIRI");
    JLabel lnama = new JLabel("SILVA DIAN VARINI");
    JLabel lttl = new JLabel("Medan, 30 Maret 2000");
    Font biasa = new
       Font("Arial",Font.PLAIN,12);
    JLabel labelGambar;
    
    String[]namaAgama ={"Islam","Kristen","Katolik","Hindu","Buddha"};
    JComboBox cmbAgama = new JComboBox(namaAgama);
    
    JRadioButton rbPria = new JRadioButton("L");
    JRadioButton rbWanita = new JRadioButton("P");
    
    JLabel lalamat = new JLabel("Alamat");
    JTextArea falamat = new JTextArea();
       //JScrollPane sp= new JScrollPane();
   JScrollPane sp=new JScrollPane(falamat,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
   
   //JPanel panel= new JPanel();

   JButton btnEdit = new JButton("Edit");
   JButton btnSave = new JButton("Save");

   public GUI() {
        
       setTitle("Biodata");
	setDefaultCloseOperation(3);
	setSize(255,620);
        
        labelGambar = new JLabel (new ImageIcon (getClass().getResource(("gambar.jpg"))));
	
        ButtonGroup group = new ButtonGroup();
	group.add(rbPria);
        group.add(rbWanita);
	
        this.falamat = new JTextArea();
        //this.sp = new JScrollPane();
         
        falamat.setLineWrap(true);
        falamat.setWrapStyleWord(true);
        
        setLayout(null);
        add(lbiodata);
        add(labelGambar);
        add(lnama);
        add(lttl);
        lttl.setFont(biasa);
        add(cmbAgama);
        add(rbPria);
	add(rbWanita);
        add(lalamat);
        add(falamat);
        add(sp);
        add(btnEdit);
	add(btnSave);

        
        lbiodata.setBounds(75,10,120,15);
        labelGambar.setBounds(10,35,210,100);
        lnama.setBounds(75,150,120,15);
        lttl.setBounds(65,170,190,15);
	cmbAgama.setBounds(10,220,215,20);
        rbPria.setBounds(45,250,50,20);
	rbWanita.setBounds(155,250,50,20);
        lalamat.setBounds(90,300,120,15);
        falamat.setBounds(10,320,210,150);
        sp.setBounds(10,320,210,150) ;
        btnEdit.setBounds(20,550,75,25);
        btnSave.setBounds(140,550,75,25);
        sp.getViewport().setBackground(Color.RED);
        sp.getViewport().add(falamat);
	setVisible(true);
   }

    
}

            
            
    