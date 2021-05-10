//Tampilan awal program
//Mengimport class-class yang diperlukan dari yang telah disediakan java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Menu implements ActionListener{ //class Menu mengimplementasi class ActionListener yang merupakan class interface 
    private JLabel label1, label2, label3;
    private JButton btnA, btnB;

    public Menu(){
        JFrame frame = new JFrame();
        frame.setBounds(0,0,500,400); //mengatur tampilan dan posisi frame dengan format(x-coordinate, y-coordinate, width, height) 
        frame.setTitle("SIMPLE PROGRAM");

        label1 = new JLabel("Silahkan pilih lantai");
        label1.setBounds(180,15,200,25);
        frame.add(label1);

        label2 = new JLabel("Khusus Motor");
        label2.setBounds(195,40,200,25);
        frame.add(label2);
       
        btnA = new JButton("A");
        btnA.setBounds(180,65,110,25);
        frame.add(btnA);

        label3 = new JLabel("Khusus Mobil");
        label3.setBounds(195,120,200,25);
        frame.add(label3);
       
        btnB = new JButton("B");
        btnB.setBounds(180,145,110,25);
        frame.add(btnB);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //menambahkan actionListener pada button a dan b
        btnA.addActionListener(this);
        btnB.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){ //Mengatur ketika button mendapat action, dan mengarahkan ke class yang ingin dituju
        if(e.getSource()==btnA){
            A frame = new A();
            frame.setVisible(true);
        }else if(e.getSource()==btnB){
            B frame = new B();
            frame.setVisible(true);
        }
    }
}