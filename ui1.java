import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ui1 {

    public static void main(String[] args) {

        JFrame fr = new JFrame("โปรเกรมบวกเลข");

        fr.setLayout(new FlowLayout());
        JPanel pn = new JPanel();
        pn.setLayout(new GridLayout(4, 2, 0, 10)); //set Layout grid 

        JLabel n = new JLabel("ตัวเลขที่1 ");
            n.setFont(new Font("Angsana New", Font.PLAIN, 16));
            JTextField txtone = new JTextField();
            txtone.setBackground(Color.blue);
            txtone.setForeground(Color.white);


        JLabel m = new JLabel("ตัวเลขที่2");
            m.setFont(new Font("Angsana New", Font.BOLD, 16));
            JTextField txttwo = new JTextField();
            txttwo.setBackground(Color.blue);
            txttwo.setForeground(Color.white);

        JLabel lbtn = new JLabel("");
            JButton btn = new JButton("คำนวณ");
            btn.setFont(new Font("Angsana New", Font.BOLD, 16));


            
           

        JLabel sum = new JLabel("คะแนนรวม : ");
            sum.setFont(new Font("Angsana New", Font.BOLD, 16));
            JTextField txtsum = new JTextField();
            txtsum.setBackground(Color.blue);
            txtsum.setForeground(Color.white);



            //process System event button get by Varlible
            btn.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    int numone = Integer.parseInt(txtone.getText());
                    int numtwo = Integer.parseInt(txttwo.getText());
                    txtsum.setText(""+(numone+numtwo));  
                }
            });

//   Gride    c 6        r 2 

    /*[1][1]*/   pn.add(n);     /*[1][2]*/  pn.add(txtone);
    /*[2][1]*/  pn.add(m);      /*[2][2]*/ pn.add(txttwo);
    /*[4][1]*/   pn.add(lbtn);  /*[4][2]*/ pn.add(btn);
    /*[6][1]*/   pn.add(sum);   /*[6][2]*/ pn.add(txtsum);



        pn.setSize(300, 300);
        fr.add(pn);
        fr.setSize(300, 300);
        fr.setVisible(true);
    }
}

