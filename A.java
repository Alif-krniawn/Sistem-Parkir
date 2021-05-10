//Tampilan awal program
//Mengimport class-class yang diperlukan dari yang telah disediakan java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A extends JFrame implements ActionListener{ 
    //class A mengimplementasi class ActionListener yang merupakan class interface dan dihubungkan dengan class JFrame dari bawaan java
    private JButton btnA1, btnA2, btnA3, btnA4, btnA5;
    private JButton btnA6, btnA7, btnA8, btnA9, btnA10;
    private JTextField namat, not, warnat, kodet;
    private JButton btn, bttn;
    private JLabel nama, no, warna;
    private JLabel ttl, kode;

    public A(){

        setBounds(0,0,400,1000); //mengatur tampilan dan posisi frame dengan format(x-coordinate, y-coordinate, width, height)
        setTitle("FORM PENDATAAN");

        ttl = new JLabel("Denah dan Kode Tempat Parkir Lantai A");
        ttl.setBounds(10,0,500,25);
        add(ttl);

        //membuat tampilan tempat parkir dengan button agar penempatan posisi lebih akurat

        btnA1 = new JButton("A1");
        btnA1.setBounds(10,30,50,100);
        add(btnA1);

        btnA2 = new JButton("A2");
        btnA2.setBounds(70,30,50,100);
        add(btnA2);

        btnA3 = new JButton("A3");
        btnA3.setBounds(130,30,50,100);
        add(btnA3);

        btnA4 = new JButton("A4");
        btnA4.setBounds(190,30,50,100);
        add(btnA4);

        btnA5 = new JButton("A5");
        btnA5.setBounds(250,30,50,100);
        add(btnA5);

        btnA6 = new JButton("A6");
        btnA6.setBounds(10,145,50,100);
        add(btnA6);

        btnA7 = new JButton("A7");
        btnA7.setBounds(70,145,50,100);
        add(btnA7);

        btnA8 = new JButton("A8");
        btnA8.setBounds(130,145,50,100);
        add(btnA8);

        btnA9 = new JButton("A9");
        btnA9.setBounds(190,145,50,100);
        add(btnA9);

        btnA10 = new JButton("A10");
        btnA10.setBounds(250,145,65,100);
        add(btnA10);

        //membuat pengisian form untuk mendata orang yang menggunakan program parkir

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

        //button dengan pilihan selesai untuk menunjukkan hasil pengisian dan pilihan kembali untuk kembali ke menu awal

        btn = new JButton("Selesai");
        btn.setBounds(100,400,150,25);
        add(btn);

        bttn = new JButton("Kembali");
        bttn.setBounds(100,450,150,25);
        add(bttn);

        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //menambahkan actionListener pada button yang ada
        btn.addActionListener(this);
        bttn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn){ //mendapatkan isi dari setiap form dan menampilkan pesan dari isian tadi ketika tombol "Selesai" mendapat respon
            String nm = namat.getText();
            String n = not.getText();
            String wrn = warnat.getText();
            String kd = kodet.getText();
            JOptionPane.showMessageDialog(null, "Data pengunjung:\n\n Nama:  "+nm+"\n Plat Nomor:    "+n+"\n Warna Kendaraan:   "+wrn+"\n Menempati blok "+kd+"\n\n*Simpan pesan ini sebagai pengingat bahwa anda telah parkir di tempat kami.", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        }else if(e.getSource()==bttn){ //ketika tombol "Kembali" mendapat respon, maka halaman akan dialihkan ke menu awal
            Menu frame = new Menu();
            setVisible(false);
        }
    }
}