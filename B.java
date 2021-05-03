import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class B extends JFrame implements ActionListener{
    private JButton btnB1, btnB2, btnB3, btnB4;
    private JTextField namat, not, warnat, kodet;
    private JButton btn, bttn;
    private JLabel nama, no, warna;
    private JLabel ttl, kode;

    public B(){

        setBounds(0,0,400,600);
        setTitle("FORM PENDATAAN");

        ttl = new JLabel("Denah dan Kode Tempat Parkir Lantai B");
        ttl.setBounds(10,0,500,25);
        add(ttl);

        btnB1 = new JButton("B1");
        btnB1.setBounds(10,30,130,100);
        add(btnB1);

        btnB2 = new JButton("B2");
        btnB2.setBounds(160,30,130,100);
        add(btnB2);

        btnB3 = new JButton("B3");
        btnB3.setBounds(10,150,130,100);
        add(btnB3);

        btnB4 = new JButton("B4");
        btnB4.setBounds(160,150,130,100);
        add(btnB4);

        nama = new JLabel("Masukkan Nama Pemilik");
        nama.setBounds(10,265,250,25);
        add(nama);

        namat = new JTextField();
        namat.setBounds(260,265,100,25);
        add(namat);
        
        no = new JLabel("Masukkan Plat Nomor");
        no.setBounds(10,300,250,25);
        add(no);

        not = new JTextField();
        not.setBounds(260,300,100,25);
        add(not);

        warna = new JLabel("Masukkan Warna Kendaraan");
        warna.setBounds(10,335,250,25);
        add(warna);

        warnat = new JTextField();
        warnat.setBounds(260,335,100,25);
        add(warnat);

        kode = new JLabel("Masukkan Kode Parkir");
        kode.setBounds(10,370,250,25);
        add(kode);

        kodet = new JTextField();
        kodet.setBounds(260,370,100,25);
        add(kodet);

        btn = new JButton("Selesai");
        btn.setBounds(100,400,150,25);
        add(btn);

        bttn = new JButton("Kembali");
        bttn.setBounds(100,450,150,25);
        add(bttn);

        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(this);
        bttn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn){
            String nm = namat.getText();
            String n = not.getText();
            String wrn = warnat.getText();
            String kd = kodet.getText();
            JOptionPane.showMessageDialog(null, "Data pengunjung:\n\n Nama:  "+nm+"\n Plat Nomor:    "+n+"\n Warna Kendaraan:   "+wrn+"\n Menempati blok "+kd+"\n\n*Simpan pesan ini sebagai pengingat bahwa anda telah parkir di tempat kami.", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        }else if(e.getSource()==bttn){
            Menu frame = new Menu();
            setVisible(false);
        }
    }
}